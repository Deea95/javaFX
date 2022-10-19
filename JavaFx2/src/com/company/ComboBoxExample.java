package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();

        ComboBox<String> comboBox = new ComboBox<>();
        ObservableList<String> counties = FXCollections.observableArrayList();
        counties.add("Dolj");
        counties.add("Iasi");
        counties.add("Constanta");

        comboBox.setItems(counties);

        vBox.getChildren().add(comboBox);
        Scene scene = new Scene(vBox, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
