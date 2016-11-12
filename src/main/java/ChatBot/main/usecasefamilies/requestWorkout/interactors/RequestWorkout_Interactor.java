package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import org.jusecase.Usecase;

public class RequestWorkout_Interactor implements Usecase<RequestWorkout_Request, RequestWorkout_Response> {

    public RequestWorkout_Response execute(RequestWorkout_Request request) {
        String sessionId = request.sessionId;
        ResultGenerator generator = new ResultGenerator(sessionId);

        String speech = "";
        String displayText = request.resultFulfillmentSpeech +
                generator.actionResult(request.resultAction, request.parameters);


        return new RequestWorkout_Response(speech, displayText);
    }

}