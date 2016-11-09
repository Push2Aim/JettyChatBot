package services;

import adapters.Json;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostServletTest {
    private PostServlet test;

    @Before
    public void setUp() throws Exception {
        test = new PostServlet();
    }


    @Test
    public void processRequest_givenRequestWorkout_returnsWorkoutPlan() throws Exception {
        Object actual = test.processRequest(getInputJson());
        Assert.assertEquals(getExpectedJson(), Json.toJson(actual));
    }

    private String getExpectedJson() {
        return ("{" +
                "\"speech\":\"This will be fun:\\nAll you need is a small spot where you fit in while lying. You\\u0027ll also need a chair, bench or table. Just follow the list and ask me if you need to know anything. An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you\\u0027ve got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. \\n10 mins Warmup \\n2 minutes Jumping Jack \\n15 Burpees \\nStretching http://bit.ly/2cA9txv \\n20 mins AMRAP \\n20 Mountain Climbers (per leg) \\n15 Dips \\n12 Air Squats \\n9 Push-Ups \\n7 Sit-Ups \\n5 Squat Jumps\"," +
                "\"displayText\":\"displayText\"," +
                "\"source\":\"JettyChatBot\"" +
                "}");
    }

    private Json getInputJson() {
        return new Json("{\n" +
                "  \"id\": \"ef1dd04c-667b-41a2-be6f-6bd03dfdfef0\",\n" +
                "  \"timestamp\": \"2016-10-23T18:32:41.252Z\",\n" +
                "  \"result\": {\n" +
                "    \"source\": \"agent\",\n" +
                "    \"resolvedQuery\": \"30 min at home\",\n" +
                "    \"action\": \"generateWorkout\",\n" +
                "    \"actionIncomplete\": false,\n" +
                "    \"parameters\": {\n" +
                "      \"date\": \"\",\n" +
                "      \"duration\": {\n" +
                "        \"amount\": 30,\n" +
                "        \"unit\": \"min\"\n" +
                "      },\n" +
                "      \"given-name\": \"\",\n" +
                "      \"location\": \"home\",\n" +
                "      \"make\": \"\",\n" +
                "      \"make1\": \"\",\n" +
                "      \"number\": \"\",\n" +
                "      \"workout\": \"\"\n" +
                "    },\n" +
                "    \"contexts\": [],\n" +
                "    \"metadata\": {\n" +
                "      \"intentId\": \"62e9481f-37f5-4bcd-848d-aca8fa4e1bd2\",\n" +
                "      \"webhookUsed\": \"true\",\n" +
                "      \"intentName\": \"I got x minutes what should I do\"\n" +
                "    },\n" +
                "    \"fulfillment\": {\n" +
                "      \"speech\": \"This will be fun:\"\n" +
                "    },\n" +
                "    \"score\": 0.92\n" +
                "  },\n" +
                "  \"status\": {\n" +
                "    \"code\": 200,\n" +
                "    \"errorType\": \"success\"\n" +
                "  },\n" +
                "  \"sessionId\": \"5e38aa19-7ec2-4546-a07a-35369d95b298\"\n" +
                "}\n");
    }


}