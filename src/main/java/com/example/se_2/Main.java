package com.example.se_2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private final TableView table = new TableView();
    final ObservableList<Contact> data = FXCollections.observableArrayList(
            new Contact("Jacob", "Smith", "jacob.smith@example.com"),
            new Contact("Isabella", "Johnson", "isabella.johnson@example.com"),
            new Contact("Ethan", "Williams", "ethan.williams@example.com"),
            new Contact("Emma", "Jones", "emma.jones@example.com"),
            new Contact("Michael", "Brown", "michael.brown@example.com")
    );

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("TelephoneBook");
        stage.setScene(scene);

        //SearchTextField
        root.setTop(new SearchArea().getpane());

        //Table for contacts
        TableView table = new TableView();

        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn numberCol = new TableColumn("Number");
        table.getColumns().addAll(firstNameCol, lastNameCol, numberCol);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Contact,String>("firstName")
        );
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Contact,String>("lastName")
        );
        numberCol.setCellValueFactory(
                new PropertyValueFactory<Contact,String>("number")
        );

        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, numberCol);

        table.setEditable(true);
        root.setCenter(table);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}