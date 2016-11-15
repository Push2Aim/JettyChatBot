package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import adapters.Json;

/**
 * NAME 	    TYPE	                    DESCRIPTION
 * speech         String                      Voice response to the request.
 * displayText    String                      Text displayed on the user device screen.
 * data           Dictionary of objects       Additional data required for performing the action on the client side. The data is sent to the client in the original form and is not processed by Api.ai.
 * source         String                      Data source.
 * contextOut     Array of context objects    Array of context objects set after intent completion.
 * Example:
 * "contextOut": [{"name":"weather", "lifespan":2, "parameters":{"city":"Rome"}}]
 */
@SuppressWarnings("unused")
public class RequestWorkout_Response {
    final String speech;
    final String displayText;
    final String source = "JettyChatBot";
    Object data;
    Object contextOut;

    public RequestWorkout_Response(String speech, String displayText) {
        this.speech = speech;
        this.displayText = displayText;
        this.data = new Json("{\n" +
                "          \"payload\": {\n" +
                "            \"facebook\": {\n" +
                "              \"attachment\": {\n" +
                "                \"type\": \"file\",\n" +
                "                \"payload\": {\n" +
                "                  \"url\": \"https://raw.githubusercontent.com/Push2Aim/JettyChatBot/master/src/main/webapp/content%20pillar%20system%202.png\"\n" +
                "                }\n" +
                "              }\n" +
                "            }\n" +
                "          },\n" +
                "          \"type\": 4\n" +
                "        }").toString();
    }

}