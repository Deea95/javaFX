package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class TableViewExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox vBox = new VBox();

        TableView tableView = new TableView();

        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("firstName"));

        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("lastName"));

        TableColumn emailCol = new TableColumn("Email");
        emailCol.setCellValueFactory(
                new PropertyValueFactory<>("email"));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Posa", "Bogdan", "trance1st@yahoo.com"));
        personList.add(new Person("Posa", "Petre", "trance1st@yahoo.com"));

        tableView.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        tableView.setItems(FXCollections.observableList(personList));

        vBox.getChildren().add(tableView);
        Scene scene = new Scene(vBox, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
