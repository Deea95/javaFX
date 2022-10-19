package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewSecondExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        VBox vBox = new VBox();

        ObservableList<String> observableList = FXCollections.observableArrayList();

        ListView<String> listView = new ListView<>();
        listView.setItems(observableList);

        TextField textField = new TextField();
        textField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                observableList.add(textField.getText());
            }
        });
        vBox.getChildren().addAll(listView, textField);

        Scene scene = new Scene(vBox, 700, 700);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
