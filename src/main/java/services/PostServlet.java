package services;

import ChatBot.main.requestor.Boundary;
import ChatBot.main.usecasefamilies.requestWorkout.interactors.RequestWorkout_Request;
import ChatBot.main.usecasefamilies.requestWorkout.responders.RequestWorkout_UseCase;
import adapters.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Json json = receiveRequest(request);

        Object resp = processRequest(json);

        sendResponse(response, resp);
    }

    Object processRequest(Json json) {
        RequestWorkout_UseCase boundary = new Boundary();
        return boundary.requestWorkout(new RequestWorkout_Request(json));
    }

    private Json receiveRequest(HttpServletRequest request) throws IOException {
        System.out.println("POST content: " + request.getContentType());
        Json json = Json.parsReader(request.getReader());
        System.out.println("POST request: " + json.toString().replace(",", ",\n").replace("{", "{\n\t"));
        return json;
    }

    private void sendResponse(HttpServletResponse response, Object resp) throws IOException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(Json.toJson(resp));
    }

}
