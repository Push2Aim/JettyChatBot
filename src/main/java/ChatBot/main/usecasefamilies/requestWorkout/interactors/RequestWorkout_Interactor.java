package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import ChatBot.JsonFiles;
import adapters.Json;
import org.json.JSONObject;
import org.jusecase.Usecase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;

public class RequestWorkout_Interactor implements Usecase<RequestWorkout_Request, RequestWorkout_Response> {

    public RequestWorkout_Response execute(RequestWorkout_Request request) {
        ResultGenerator generator = new ResultGenerator();

        String sessionId = request.sessionId;
        String speech = request.resultFulfillmentSpeech +
                generator.actionResult(request.resultAction, request.parameters);
        String displayText = "displayText";


        return new RequestWorkout_Response(speech, displayText);
    }

    private class ResultGenerator {
        private String actionResult(String resultAction, Map<String, Object> parameters) {
            if (resultAction.equals("generateWorkout")) return generateWorkout(parameters);
            return "";
        }

        private String generateWorkout(Map<String, Object> parameters) {
            String location = String.valueOf(parameters.get("location"));
            Map<String, String> duration = (Map<String, String>) parameters.get("duration");

            JSONObject details = new Json(JsonFiles.get("details.json"));
            JSONObject workouts = new Json(JsonFiles.get("workout.json"));

            return printDetails(location, details);
        }

        private String printDetails(String location, JSONObject details) {
            JSONObject atLocation = (JSONObject) details.get(location);
            String description = (String) atLocation.get("description");
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
}