package ChatBot.main.usecasefamilies.requestWorkout.responders;

import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Request;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Response;

public interface RequestWorkout_UseCase {
    RequestWorkout_Response requestWorkout(RequestWorkout_Request RequestWorkout_Request);
}
