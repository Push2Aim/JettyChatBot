package ChatBot.main.usecasefamilies.requestWorkout.interactors;

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
    final String source = "JettyChatBot";
    String speech;
    Object data;
    Object contextOut;

    public RequestWorkout_Response(String speech) {
        this.speech = speech;
        this.data = new Data();
    }
}