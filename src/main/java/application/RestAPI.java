package application;

import java.net.URI;
import java.net.http.*;
import org.json.JSONObject;

public class RestAPI {
    public String getResponse() throws Exception {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://reqres.in/api/users/2"))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        Transcript transcript = new Transcript();

        return transcript.getData(getResponse);
    }

    public String setResponse(String name) throws Exception {
        JSONObject json = new JSONObject();

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://reqres.in/api/users"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json.toString()))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());

        return postResponse.body();
    }
}