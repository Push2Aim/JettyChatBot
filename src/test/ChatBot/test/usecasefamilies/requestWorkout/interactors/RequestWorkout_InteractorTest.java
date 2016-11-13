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

import java.util.ArrayList;

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
        RequestWorkout_Interactor.sessionIdList = new ArrayList<>();
    }


    @Test
    public void requestWorkout_givenNoLocation_givenWithDips_givenFirstTime_returnsWorkoutFor30minAtHome() {
        givenRequest(a(request().withLocation("")));
        whenRequestIsExecuted();

        thenResponseIs(a(response()));
    }

    @Test
    public void requestWorkout_givenNoDuration_givenWithDips_givenFirstTime_returnsWorkoutFor30minAtHome() {
        givenRequest(a(request().withDuration("\"\"")));
        whenRequestIsExecuted();

        thenResponseIs(a(response()));
    }

    @Test
    public void requestWorkout_givenNothing_givenWithDips_givenFirstTime_returnsWorkoutFor30minAtHome() {
        givenRequest(a(request().withDuration("\"\"").withLocation("")));
        whenRequestIsExecuted();

        thenResponseIs(a(response()));
    }

    @Test
    public void requestWorkout_given30minHome_givenWithDips_givenFirstTime_returnsDetailsWarmupWorkout() {
        givenRequest(a(request()));
        whenRequestIsExecuted();

        thenResponseIs(a(response()));
    }

    @Test
    public void requestWorkout_givenFulfillment_returnsDetailsWithFulfillment() {
        givenRequest(a(request().withFulfillment("Fulfill this:")));
        whenRequestIsExecuted();

        thenResponseIs(a(response().withFulfillment("Fulfill this:")));
    }

    @Test
    public void requestWorkout_given60minOutdoor_givenWithDips_givenFirstTime_returnsDetailsWarmupWorkoutCooldown() {
        givenRequest(a(request().withDuration(60, "min").withLocation("outdoor")));
        whenRequestIsExecuted();

        thenResponseIs(a(response().withDescription("\nAll you need is an spot where you can run and have no problem lying down. You'll also need a chair, bench or table. Just follow the list and ask me if you need anything. An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. ")
                .withWorkout("\n15 mins Warmup \n1 minute Running \n15 Burpees \n1 minute Running \n15 Burpees \nStretching http://bit.ly/2cA9txv\n30 mins AMRAP \n20 Mountain Climbers (per leg) \n15 Dips \n12 Air Squats \n9 Push-Ups \n7 Sit-Ups \n5 Squat Jumps \n3 Burpees\n15 mins Cool Down \n1 minute Running \n1 minute Walking \n1 minute Running \n1 minute Walking \nCool Down Stretch http://bit.ly/2cA9txv")
        ));
    }

    @Test
    public void requestWorkout_given15minGym_givenFirstTime_returnsDetailsWarmupWorkout() {
        givenRequest(a(request().withDuration(15, "min").withLocation("gym")));
        whenRequestIsExecuted();

        thenResponseIs(a(response().withDescription("\nAll you need is a Bench Press bench with your chosen weight on the barbell plus some light dumbbells. Wanna scale it up? Reserve the next Squat rack with your chosen weight on the barbell, and the next dip bar, also for the Leg Raises. Just follow the list and ask me if you need anything. An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed.")
                .withWorkout("\n5 mins Warmup \n2 minutes Rower \n3 minutes Stretching http://bit.ly/2cA9gKH\n10 mins AMRAP \n10 Bench Presses \n10 Squats \n10 Dumbbell Shoulder Presses \n10 Leg Raises")));
    }

    @Test
    public void requestWorkout_given5min_givenNoDips_givenFirstTime_returnsDetailsWithoutDipsTips() {
        givenRequest(a(request().withDuration(5, "min")));
        whenRequestIsExecuted();

        thenResponseIs(a(response().withDescription("\nAll you need is a small spot where you fit in while lying. Just follow the list and ask me if you need to know anything. An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. ")
                .withWorkout("\n2 mins Warmup \n1 minute Jumping Jack \n1 minute Stretching http://bit.ly/2cjLTke\n3 mins AMRAP \n5 Air Squats \n5 Push-Ups \n5 Sit-Ups")));
    }

    @Test
    public void requestWorkout_givenSecondTime_returnsDetailsWithoutAtFirst() {
        givenRequest(a(request()));
        whenRequestIsExecuted();

        givenRequest(a(request()));
        whenRequestIsExecuted();

        thenResponseIs(a(response().withDescription("\nAll you need is a small spot where you fit in while lying. You\u0027ll also need a chair, bench or table. Just follow the list and ask me if you need to know anything. ")
        ));
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
        private String duration;
        private String location = "home";
        private String fulfillment = "This will be fun:";

        private String getDuration() {
            return "{\n" +
                    "\"amount\": " + durationAmount + ",\n" +
                    "\"unit\": \"" + durationUnit + "\"\n" +
                    "}";
        }

        public RequestWorkout_Request build() {
            return new RequestWorkout_Request(getRequestBody());
        }

        private Json getRequestBody() {
            return new Json("{\n" +
                    "  \"result\": {\n" +
                    "    \"action\": \"generateWorkout\",\n" +
                    "    \"parameters\": {\n" +
                    "      \"duration\": " + (duration != null ? duration : getDuration()) + ",\n" +
                    "      \"location\": \"" + location + "\",\n" +
                    "    },\n" +
                    "    \"fulfillment\": {\n" +
                    "      \"speech\": \"" + fulfillment + "\"\n" +
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

        RequestBuilder withDuration(String duration) {
            this.duration = duration;
            return this;
        }

        RequestBuilder withFulfillment(String fulfillment) {
            this.fulfillment = fulfillment;
            return this;
        }
    }

    private class ResponseBuilder implements Builder<RequestWorkout_Response> {

        private String atFirst = "An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. ";
        private String atDips = "You'll also need a chair, bench or table.";
        private String description = getDescription();
        private String workout = "\n10 mins Warmup \n2 minutes Jumping Jack \n15 Burpees \nStretching http://bit.ly/2cA9txv\n20 mins AMRAP \n20 Mountain Climbers (per leg) \n15 Dips \n12 Air Squats \n9 Push-Ups \n7 Sit-Ups \n5 Squat Jumps";
        private String fulfillment = "This will be fun:";

        private String getDescription() {
            return "\nAll you need is a small spot where you fit in while lying. " + atDips + " Just follow the list and ask me if you need to know anything. " + atFirst;
        }

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