package application;

import org.json.JSONObject;
import java.net.http.HttpResponse;

public class Transcript {

    // This is under "data"
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    // This is under support
    private String url;
    private String text;

    public String getData(HttpResponse<String> getResponse) {
        JSONObject json = new JSONObject(getResponse.body());
        JSONObject data = json.getJSONObject("data");

        return "Email: " + data.getString("email") +
        "First Name: " + data.getString("first_name") +
        "Last Name: " + data.getString("last_name") +
        "Avatar: " + data.getString("avatar");
    }

    // Need to learn more about setters for Reqres
    public void setData(String first_name) {
        this.first_name = first_name;
    }
}