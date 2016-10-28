package ChatBot.main.usecasefamilies.requestWorkout.interactors;

import org.jusecase.Usecase;

public class RequestWorkout_Interactor implements Usecase<RequestWorkout_Request, RequestWorkout_Response> {

    public ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Response execute(RequestWorkout_Request request) {
        WorkoutGenerator generator = new WorkoutGenerator(request);

        String speech = "speech";
        String displayText = "displayText";
        return new RequestWorkout_Response(speech, displayText);
    }

    private class WorkoutGenerator {
        public WorkoutGenerator(RequestWorkout_Request request) {
        }
    }
}
