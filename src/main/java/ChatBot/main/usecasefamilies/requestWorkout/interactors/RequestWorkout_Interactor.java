package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import ChatBot.JsonFiles;
import adapters.Json;
import org.jusecase.Usecase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class RequestWorkout_Interactor implements Usecase<RequestWorkout_Request, RequestWorkout_Response> {
    public static ArrayList<String> sessionIdList = new ArrayList<>();


    public RequestWorkout_Response execute(RequestWorkout_Request request) {
        String sessionId = request.sessionId;

        Json detailsJson = new Json(JsonFiles.get("details.json"));
        Json workoutsJson = new Json(JsonFiles.get("workout.json"));
        ResultGenerator generator = new ResultGenerator(detailsJson, workoutsJson, isFirstUser(sessionId));

        String speech = request.resultFulfillmentSpeech +
                generator.actionResult(request.resultAction, request.parameters);
        String displayText = "";


        return new RequestWorkout_Response(speech, displayText);
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