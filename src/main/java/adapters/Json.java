package adapters;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;

public class Json extends JSONObject {
    public Json(String source) {
     super(source);
    }

    Json() {
    }

    public static Json parsReader(BufferedReader reader)
            throws IOException,JSONException {
        Json out = new Json();
        try {
            return new Json(out.bufferedReaderToStringBuffer(reader).toString());
        } catch (JSONException e) {
            throw new JSONException ("Error parsing JSON form request string");
        }
    }

    public static String toJson(Object source) {
        Gson g = new Gson();
        return g.toJson(source);
    }

    StringBuffer bufferedReaderToStringBuffer(BufferedReader reader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = readLine(reader)) != null) {
            stringBuffer.append(line);
        }
        return stringBuffer;
    }

    protected String readLine(BufferedReader reader) throws IOException {
        if (reader == null) return null;
        return reader.readLine();
    }

}
