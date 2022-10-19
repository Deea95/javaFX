package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class GridPaneExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label userLabel = new Label("user");

        Label passLabel = new Label("pass");

        TextField userText = new TextField();
        TextField passText = new TextField();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setGridLinesVisible(true);

        GridPane.setConstraints(userLabel, 0, 0);
        GridPane.setConstraints(userText, 1, 0);

        GridPane.setConstraints(passLabel, 0, 1);
        GridPane.setConstraints(passText, 1, 1);

        gridPane.getChildren().addAll(userLabel, passLabel, userText, passText);


        Scene scene = new Scene(gridPane, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
