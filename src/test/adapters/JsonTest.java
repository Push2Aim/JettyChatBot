package adapters;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class JsonTest extends Json {
    private final String[] readLineOut = {"1", "2", "3", null};
    private int readLineIndex = 0;

    @Override
    protected String readLine(BufferedReader reader) throws IOException {
        return readLineOut[readLineIndex++];
    }

    @Test
    public void bufferedReaderToStringBuffer_given123null_returns123() throws Exception {
        StringBuffer out = this.bufferedReaderToStringBuffer(null);
        assertEquals("123", out.toString());
    }

    @Test
    public void readLine_givenNull_returnsNull() throws Exception {
        Json json = new Json();
        assertEquals(null, json.readLine(null));
    }

    @Test
    public void toJson_givenObject_returnsString() throws Exception {
        TestInput input = new TestInput();
        String expected = "{\"number\":1,\"bool\":true," +
                "\"word\":\"Buddy\",\"arr\":[1,2,3]}";
        assertEquals(expected, Json.toJson(input));
    }

    private class TestInput {
        int number = 1;
        boolean bool = true;
        String word = "Buddy";
        int[] arr = {1, 2, 3};
    }

}