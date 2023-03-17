package com.example.se_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        //TextField
        TextField searchTextField = new TextField();
        root.setBottom(searchTextField);

        //Button
        Button searchButton = new Button("Click here");
        searchButton.setMaxSize(320,100);
        searchButton.onActionProperty().setValue(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(searchTextField.getText());
            }
        });
        searchButton.setVisible(true);
        root.setTop(searchButton);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}