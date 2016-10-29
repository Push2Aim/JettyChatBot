package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import java.util.Map;

public class RequestWorkout_Request {
    private final String sessionId;

    public RequestWorkout_Request(Map<String, Object> requestBody) {
        this.sessionId = String.valueOf(requestBody.get("sessionId"));
        System.err.println("requestBody: " + requestBody.toString().replace(", ", ", \n"));
    }


}
/*
* if (requestBody.sessionId) {
                    thisSessionId = requestBody.sessionId;
                }

                if (requestBody.result.fulfillment) {
                    speech += requestBody.result.fulfillment.speech;
                    speech += ' ';
                }

                if (requestBody.result.action === "generateWorkout") {  
                    speech += generateWorkout(parsDuration(requestBody.result.parameters.duration), parsLocation(requestBody.result.parameters.location));
                }
*/