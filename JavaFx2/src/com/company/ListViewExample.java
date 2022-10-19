package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        VBox vBox = new VBox();

        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.add("Ana");
        observableList.add("Maria");
        observableList.add("Ana");
        observableList.add("Maria");

        ListView<String> listView = new ListView<>();
        listView.setPrefHeight(2 * 24 + 2);
        listView.setItems(observableList);

        vBox.getChildren().addAll(listView, new Label("ana"));

        Scene scene = new Scene(vBox, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
