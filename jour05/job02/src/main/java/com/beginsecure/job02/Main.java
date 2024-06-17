package com.beginsecure.job02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();

        Button button = new Button("Quitter");

        root.setBottom(button);
        BorderPane.setMargin(button, new Insets(10));

        button.setOnAction(event -> primaryStage.close());

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("BorderLayout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
