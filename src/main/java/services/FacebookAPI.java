package services;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FacebookAPI {

    private static final String PAGE_ACCESS_TOKEN = "";

    static void sendPost(String userID, String message) throws Exception {

        String url = "https://graph.facebook.com/v2.6/me/messages?access_token=" + PAGE_ACCESS_TOKEN;

        HttpClient httpClient = new DefaultHttpClient();
        HttpPost request = new HttpPost(url);

        request.setHeader("Content-Type", "application/json");

        StringEntity params = new StringEntity("{\n" +
                "  \"recipient\":{\n" +
                "    \"id\":\"" + userID + "\"\n" +
                "  },\n" +
                "  \"message\":{\n" +
                "    \"text\":\"" + message + "\"\n" +
                "  }\n" +
                "}");
        request.setEntity(params);
        HttpResponse response = httpClient.execute(request);

        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + request.getEntity());
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());

    }
}
