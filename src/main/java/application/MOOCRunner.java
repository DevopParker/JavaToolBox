package application;

import part1.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MOOCRunner extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Particle Life Emulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);

    }
}

/*
    Menu.runMenu();

    RestAPI api = new RestAPI();
    String postResponse = api.createUser("John Doe");

    System.out.println("API Post response:");
    System.out.println(api.getResponse());
 */