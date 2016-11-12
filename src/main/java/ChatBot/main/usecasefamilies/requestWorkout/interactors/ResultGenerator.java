package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import ChatBot.JsonFiles;
import adapters.Json;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ResultGenerator {
    private final ArrayList<String> sessionIdList = new ArrayList<>();
    private final String sessionId;

    ResultGenerator(String sessionId) {
        this.sessionId = sessionId;
    }

    String actionResult(String resultAction, Map<String, Object> parameters) {
        if (resultAction.equals("generateWorkout")) return generateWorkout(parameters);
        return "";
    }

    private String generateWorkout(Map<String, Object> parameters) {
        String location = extractLocation(parameters);
        Map<String, Object> duration = extractDuration(parameters);

        JSONObject details = new Json(JsonFiles.get("details.json"));
        JSONObject workouts = new Json(JsonFiles.get("workout.json"));
        JSONArray workoutsList = (JSONArray) workouts.get("workouts");
        ArrayList<JSONObject> workout = filterLocation(workoutsList, location);
        workout = filterDuration(workout, duration);

        JSONObject finalWorkout = workout.get(0);
        return printDetails(location, finalWorkout, details) + printWorkout(finalWorkout);
    }

    private Map<String, Object> extractDuration(Map<String, Object> parameters) {
        Object duration = parameters.get("duration");
        if (String.valueOf(duration).isEmpty()) return getDefaultDuration();

        return (Map<String, Object>) duration;
    }

    private Map<String, Object> getDefaultDuration() {
        HashMap<String, Object> duration = new HashMap<>();
        duration.put("amount", 30);
        duration.put("unit", "min");
        return duration;
    }

    private String extractLocation(Map<String, Object> parameters) {
        String location = String.valueOf(parameters.get("location"));
        return location.isEmpty() ? "home" : location;
    }

    private ArrayList<JSONObject> filterDuration(ArrayList<JSONObject> workouts, Map<String, Object> durationMap) {
        int duration = ((Integer) durationMap.get("amount"));
        int floor = (int) (Math.floor(duration / 5) * 5);

        ArrayList<JSONObject> out = new ArrayList<>();
        for (JSONObject workout : workouts) {
            int amount = (Integer) workout.get("duration");
            if (floor == amount) out.add(workout);
        }

        return out;
    }

    private ArrayList<JSONObject> filterLocation(JSONArray workouts, String location) {
        ArrayList<JSONObject> out = new ArrayList<>();
        for (Object workout : workouts) {
            JSONObject jsonWorkout = (JSONObject) workout;
            if (String.valueOf(jsonWorkout.get("locations")).contains(location)) out.add(jsonWorkout);
        }

        return out;
    }

    private String printWorkout(JSONObject workout) {
        JSONObject warmup = (JSONObject) workout.get("warmup");
        JSONObject exercises = (JSONObject) workout.get("workout");
        JSONObject cooldown = null;

        if (workout.has("cooldown"))
            cooldown = (JSONObject) workout.get("cooldown");

        return printExercises(warmup)
                + printExercises(exercises)
                + printExercises(cooldown);
    }

    private String printExercises(JSONObject jsonObject) {
        if (jsonObject == null) return "";

        String out = "\n" + jsonObject.get("time");
        JSONArray workoutsList = (JSONArray) jsonObject.get("exercises");
        for (Object exe : workoutsList) {
            JSONObject jsonWorkout = (JSONObject) exe;
            out += " \n" + jsonWorkout.get("name");
            String link = (String) jsonWorkout.get("link");
            if (!link.isEmpty()) out += " " + link;
        }
        return out;
    }

    private String printDetails(String location, JSONObject workout, JSONObject details) {
        JSONObject atLocation = (JSONObject) details.get(location);
        String description = (String) atLocation.get("description");

        description = description.replace("@dips", includesDips(workout) || !isInGym(location) ? atLocation.getString("@dips") : ""); //TODO filter dips in Workout || not in gym
        description = description.replace("@first", isFirstUser(sessionId) ? atLocation.getString("@first") : "");

        return "\n" + description;
    }

    private boolean includesDips(JSONObject workout) {
        return workout.toString().contains("Dips");
    }

    private boolean isInGym(String location) {
        return location.equals("gym");
    }

    private boolean isFirstUser(String sessionId) {
        if (sessionIdList.contains(sessionId))
            return false;
        else {
            sessionIdList.add(sessionId);
            return true;
        }
    }

    private Json readFile(String filePath) {
        Json jsonObject = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.err.println("File not exists: " + file.getAbsolutePath());
                System.err.println("File not exists: " + file.getCanonicalPath());
                System.err.println("File not exists: " + file.getPath());
            } else {
                jsonObject = Json.parsReader(new BufferedReader(new FileReader(file)));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return jsonObject;

    }
}
