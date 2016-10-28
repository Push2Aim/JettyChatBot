package services;

import adapters.Json;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PostServletTest {
    private PostServlet test;

    @Before
    public void setUp() throws Exception {
        test = new PostServlet();
    }


    @Test
    @Ignore
    public void processRequest_givenRequestWorkout_returnsWorkoutPlan() throws Exception {
        Assert.assertEquals(getExpectedJson(), test.processRequest(getInputJson()));
    }

    private Object getExpectedJson() {
        return null;
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
                "    \"fulfillment\": {},\n" +
                "    \"score\": 0.92\n" +
                "  },\n" +
                "  \"status\": {\n" +
                "    \"code\": 200,\n" +
                "    \"errorType\": \"success\"\n" +
                "  },\n" +
                "  \"sessionId\": \"5e38aa19-7ec2-4546-a07a-35369d95b298\"\n" +
                "}");
    }


}