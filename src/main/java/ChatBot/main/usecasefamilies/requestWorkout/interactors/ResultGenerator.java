package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import ChatBot.JsonFiles;
import adapters.Json;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;

class ResultGenerator {
    public String actionResult(String resultAction, Map<String, Object> parameters) {
        if (resultAction.equals("generateWorkout")) return generateWorkout(parameters);
        return "";
    }

    private String generateWorkout(Map<String, Object> parameters) {
        String location = String.valueOf(parameters.get("location"));
        Map<String, Object> duration = (Map<String, Object>) parameters.get("duration");

        JSONObject details = new Json(JsonFiles.get("details.json"));
        JSONObject workouts = new Json(JsonFiles.get("workout.json"));
        JSONArray workoutsList = (JSONArray) workouts.get("workouts");
        ArrayList<JSONObject> workout = filterLocation(workoutsList, location);
        workout = filterDuration(workout, duration);

        return printDetails(location, details) + printWorkout(workout.get(0));
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
            if (jsonWorkout.get("locations").equals(location)) out.add(jsonWorkout);
        }

        return out;
    }

    private String printWorkout(JSONObject workout) {
        //+ workout.get("exercises").map(printExercise).join("\n");
        JSONObject warmup = (JSONObject) workout.get("warmup");
        JSONObject exercises = (JSONObject) workout.get("workout");
        //JSONObject cooldown = (JSONObject) workout.get("cooldown");

        return "\n" + printExcercises(warmup)
                + " \n" + printExcercises(exercises);
    }

    private String printExcercises(JSONObject jsonObject) {
        String out = (String) jsonObject.get("time");
        JSONArray workoutsList = (JSONArray) jsonObject.get("exercises");
        for (Object exe : workoutsList) {
            JSONObject jsonWorkout = (JSONObject) exe;
            out += " \n" + jsonWorkout.get("name");
            String link = (String) jsonWorkout.get("link");
            if (!link.isEmpty()) out += " " + link;
        }
        return out;
    }

    private String printDetails(String location, JSONObject details) {
        JSONObject atLocation = (JSONObject) details.get(location);
        String description = (String) atLocation.get("description");

        description = description.replace("@dips", atLocation.getString("@dips"));
        description = description.replace("@first", atLocation.getString("@first"));

        return "\n" + description;
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
