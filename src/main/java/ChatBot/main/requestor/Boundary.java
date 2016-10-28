package ChatBot.main.requestor;


import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Request;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Response;
import ChatBot.main.usecasefamilies.requestWorkout.responders.RequestWorkout_UseCase;

import static ChatBot.main.requestor.UsecaseRegistry.USECASE;

public class Boundary implements RequestWorkout_UseCase {
    public RequestWorkout_Response requestWorkout(RequestWorkout_Request request) {
        return USECASE.execute(request);
    }
}
