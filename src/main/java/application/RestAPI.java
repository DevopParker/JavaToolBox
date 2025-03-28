package application;

import java.net.URI;
import java.net.http.*;
import org.json.JSONObject;

public class RestAPI {
    public String createUser(String name) throws Exception {
        JSONObject json = new JSONObject();
        json.put("name", name);

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://reqres.in/api/users"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json.toString()))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}