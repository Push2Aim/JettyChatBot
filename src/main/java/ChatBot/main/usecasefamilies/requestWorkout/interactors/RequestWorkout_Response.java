package ChatBot.main.usecasefamilies.requestWorkout.interactors;

public class RequestWorkout_Response {
    String speech;
    String displayText;
    String source = "JettyChatBot";

    public RequestWorkout_Response(String speech, String displayText) {
        this.speech = speech;
        this.displayText = displayText;
    }

}
/*
if (requestBody.result) {
                speech = '';

                if (requestBody.sessionId) {
                    thisSessionId = requestBody.sessionId;
                }

                if (requestBody.result.fulfillment) {
                    speech += requestBody.result.fulfillment.speech;
                    speech += ' ';
                }

                if (requestBody.result.action === "generateWorkout") {
                    speech += generateWorkout(parsDuration(requestBody.result.parameters.duration), parsLocation(requestBody.result.parameters.location));
                }

                else if (requestBody.result.action)
                    speech += 'action: ' + requestBody.result.action;


speech: speech,
            displayText: speech,
            source: 'apiai-webhook-sample'
 */