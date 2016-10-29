package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import adapters.Json;
import org.json.JSONObject;

import java.util.Map;

public class RequestWorkout_Request {
    final String sessionId;
    final String resultFulfillmentSpeech;
    final String resultAction;
    final Map<String, Object> parameters;

    public RequestWorkout_Request(Json requestBody) {
        this.sessionId = String.valueOf(requestBody.get("sessionId"));
        JSONObject result = (JSONObject) requestBody.get("result");
        JSONObject fulfillment = (JSONObject) result.get("fulfillment");
        resultFulfillmentSpeech = String.valueOf(fulfillment.get("speech"));
        resultAction = String.valueOf(result.get("action"));
        parameters = ((JSONObject) result.get("parameters")).toMap();
    }


}