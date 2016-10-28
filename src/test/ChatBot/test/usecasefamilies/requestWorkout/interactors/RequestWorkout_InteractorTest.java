package ChatBot.test.usecasefamilies.requestWorkout.interactors;

import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Interactor;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Request;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Response;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.jusecase.UsecaseTest;
import org.jusecase.builders.Builder;

import static org.junit.Assert.assertEquals;
import static org.jusecase.Builders.a;

public class RequestWorkout_InteractorTest extends UsecaseTest<RequestWorkout_Request, RequestWorkout_Response> {

    @Override
    protected void thenResponseIs(RequestWorkout_Response expected) {
        Gson gson = new Gson();
        assertEquals(gson.toJson(expected), gson.toJson(response));
    }

    @Before
    public void setUp() {
        usecase = new RequestWorkout_Interactor();
    }


    @Test
    @Ignore
    public void requestWithTradeInformation() { //TODO
        givenRequest(a(request()));
        whenRequestIsExecuted();

        thenResponseIs(a(response()));
    }

    private ResponseBuilder response() {
        return new ResponseBuilder();
    }

    private RequestBuilder request() {
        return new RequestBuilder();
    }

    private static class RequestBuilder implements Builder<RequestWorkout_Request> {
        private RequestWorkout_Request RequestWorkout_Request =
                new RequestWorkout_Request(null);//TODO

        public RequestWorkout_Request build() {
            return RequestWorkout_Request;
        }
    }

    private class ResponseBuilder implements Builder<RequestWorkout_Response> {
        private RequestWorkout_Response requestWorkoutResponse =
                new RequestWorkout_Response("speech", "text");//TODO

        public RequestWorkout_Response build() {
            return requestWorkoutResponse;
        }


    }
}