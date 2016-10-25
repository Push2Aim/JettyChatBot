package adapters;

import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletRequest;
import java.io.IOException;

public class Json extends JSONObject {
    private Json(String source) {
     super(source);
    }

    public static Json build(ServletRequest request)
            throws IOException,JSONException {
        try {
            return new Json(requestToBuffer(request).toString());
        } catch (JSONException e) {
            throw new JSONException ("Error parsing JSON form request string");
        }
    }

    private static StringBuffer requestToBuffer(ServletRequest request) throws IOException {
        StringBuffer buffer = new StringBuffer();
        String line;
        while ((line = request.getReader().readLine()) != null) {
            buffer.append(line);
        }
        return buffer;
    }
}
