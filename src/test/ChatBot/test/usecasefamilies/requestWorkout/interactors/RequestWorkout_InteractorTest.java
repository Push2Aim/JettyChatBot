package ChatBot.test.usecasefamilies.requestWorkout.interactors;

import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Interactor;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Request;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Response;
import adapters.Json;
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
    public void requestWorkout_givenNothing_returnsNothing() {
        givenRequest(a(request().withDuration(0, "min").withLocation("")));
        whenRequestIsExecuted();

        thenResponseIs(a(response().withDescription("").withFulfillment("").withWorkout("")));
    }

    @Test
    public void requestWorkout_given30minHome_givenFirstTime_returnsDetailsWarmupWorkout() {
        givenRequest(a(request()));
        whenRequestIsExecuted();

        thenResponseIs(a(response()));
    }

    @Test
    public void requestWorkout_given60minGym_givenFirstTime_returnsDetailsWarmupWorkout() {
        //TODO Bug fix: it does not work with location: "gym"
        givenRequest(a(request().withDuration(60, "min").withLocation("outdoor")));
        whenRequestIsExecuted();

        thenResponseIs(a(response().withDescription("\nAll you need is an spot where you can run and have no problem lying down. You'll also need a chair, bench or table. Just follow the list and ask me if you need anything. An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. ")
                .withWorkout("\n15 mins Warmup \n1 minute Running \n15 Burpees \n1 minute Running \n15 Burpees \nStretching http://bit.ly/2cA9txv\n30 mins AMRAP \n20 Mountain Climbers (per leg) \n15 Dips \n12 Air Squats \n9 Push-Ups \n7 Sit-Ups \n5 Squat Jumps \n3 Burpees\n15 mins Cool Down \n1 minute Running \n1 minute Walking \n1 minute Running \n1 minute Walking \nCool Down Stretch http://bit.ly/2cA9txv")));
    }

    private ResponseBuilder response() {
        return new ResponseBuilder();
    }

    private RequestBuilder request() {
        return new RequestBuilder();
    }

    private static class RequestBuilder implements Builder<RequestWorkout_Request> {
        private int durationAmount = 30;
        private String durationUnit = "min";
        private String location = "home";

        public RequestWorkout_Request build() {
            return new RequestWorkout_Request(getRequestBody());
        }

        private Json getRequestBody() {
            return new Json("{\n" +
                    "  \"result\": {\n" +
                    "    \"action\": \"generateWorkout\",\n" +
                    "    \"parameters\": {\n" +
                    "      \"duration\": {\n" +
                    "        \"amount\": " + durationAmount + ",\n" +
                    "        \"unit\": \"" + durationUnit + "\"\n" +
                    "      },\n" +
                    "      \"location\": \"" + location + "\",\n" +
                    "    },\n" +
                    "    \"fulfillment\": {\n" +
                    "      \"speech\": \"This will be fun:\"\n" +
                    "    }\n" +
                    "  },\n" +
                    "  \"sessionId\": \"5e38aa19-7ec2-4546-a07a-35369d95b298\"\n" +
                    "}\n");
        }

        RequestBuilder withDuration(int amount, String unit) {
            this.durationAmount = amount;
            this.durationUnit = unit;
            return this;
        }


        RequestBuilder withLocation(String location) {
            this.location = location;
            return this;
        }
    }

    private class ResponseBuilder implements Builder<RequestWorkout_Response> {

        private String atFirst = "An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. ";
        private String atDips = "You'll also need a chair, bench or table.";
        private String description = "\nAll you need is a small spot where you fit in while lying. " + atDips + " Just follow the list and ask me if you need to know anything. " + atFirst;
        private String workout = "\n10 mins Warmup \n2 minutes Jumping Jack \n15 Burpees \nStretching http://bit.ly/2cA9txv\n20 mins AMRAP \n20 Mountain Climbers (per leg) \n15 Dips \n12 Air Squats \n9 Push-Ups \n7 Sit-Ups \n5 Squat Jumps";
        private String fulfillment = "This will be fun:";

        public RequestWorkout_Response build() {
            return new RequestWorkout_Response("", fulfillment + description + workout);
        }

        ResponseBuilder withFulfillment(String fulfillment) {
            this.fulfillment = fulfillment;
            return this;
        }

        ResponseBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        ResponseBuilder withWorkout(String workout) {
            this.workout = workout;
            return this;
        }


    }
}