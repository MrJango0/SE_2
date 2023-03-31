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

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 640, 480);
        stage.setTitle("TelephoneBook");
        stage.setScene(scene);

        //SearchTextField
        root.setTop(new SearchArea().getPane());

        //Table
        TableArea table = new TableArea();
        table.addContact("Jan", "Hadik", "015759175075");
        table.addContact("Jan", "Hadik", "015759175075000");
        root.setCenter(table.getPane());

        //edit Area
        root.setBottom(new EditArea().getPane());

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}