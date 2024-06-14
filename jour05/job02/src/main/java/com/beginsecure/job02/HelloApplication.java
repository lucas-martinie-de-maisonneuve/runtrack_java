package com.beginsecure.job02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloApplication extends Application {
    @FXML
    private Button quitButton; // Ensure this matches the fx:id in FXML

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("job02");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onQuitButtonClick() {
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }

    public static void main(String[] args) {
        launch();
    }
}
