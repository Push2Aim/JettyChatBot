package ChatBot.test.usecasefamilies.requestWorkout.interactors;

import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Interactor;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Request;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Response;
import adapters.Json;
import com.google.gson.Gson;
import org.junit.Before;
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
    public void requestWorkout_given30minHome_returnsWorkoutPlan() {
        givenRequest(a(request()));
        whenRequestIsExecuted();

        thenResponseIs(a(response().withWorkout("")));
    }

    private ResponseBuilder response() {
        return new ResponseBuilder();
    }

    private RequestBuilder request() {
        return new RequestBuilder();
    }

    private static class RequestBuilder implements Builder<RequestWorkout_Request> {
        private RequestWorkout_Request RequestWorkout_Request =
                new RequestWorkout_Request(getRequestBody());

        private Json getRequestBody() {
            return new Json("{\n" +
                    "  \"result\": {\n" +
                    "    \"action\": \"generateWorkout\",\n" +
                    "    \"parameters\": {\n" +
                    "      \"duration\": {\n" +
                    "        \"amount\": 30,\n" +
                    "        \"unit\": \"min\"\n" +
                    "      },\n" +
                    "      \"location\": \"home\",\n" +
                    "    },\n" +
                    "    \"fulfillment\": {\n" +
                    "      \"speech\": \"This will be fun:\"\n" +
                    "    }\n" +
                    "  },\n" +
                    "  \"sessionId\": \"5e38aa19-7ec2-4546-a07a-35369d95b298\"\n" +
                    "}\n");
        }

        public RequestWorkout_Request build() {
            return RequestWorkout_Request;
        }


    }

    private class ResponseBuilder implements Builder<RequestWorkout_Response> {

        private String atFirst = "An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. ";
        private String atDips = "You'll also need a chair, bench or table.";
        private String description = "\nAll you need is a small spot where you fit in while lying. " + atDips + " Just follow the list and ask me if you need to know anything. " + atFirst;
        private String workout = "\n10 mins Warmup \n2 minutes Jumping Jack\n15 Burpees\n\nStretching http://bit.ly/2cA9txv \n20 mins AMRAP \n20 Mountain Climbers (per leg)\n15 Dips\n12 Air Squats\n9 Push-Ups\n7 Sit-Ups\n5 Squat Jumps";
        private String fulfillment = "This will be fun:";

        public RequestWorkout_Response build() {
            return new RequestWorkout_Response(fulfillment + description + workout, "displayText");
        }

        ResponseBuilder withWorkout(String workout) {
            this.workout = workout;
            return this;
        }


    }
}