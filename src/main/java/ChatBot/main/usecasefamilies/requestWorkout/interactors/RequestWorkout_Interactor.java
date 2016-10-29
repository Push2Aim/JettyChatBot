package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import org.jusecase.Usecase;

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

            String out = "";

            return out;
        }
    }
}