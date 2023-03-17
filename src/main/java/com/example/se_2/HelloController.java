package com.example.se_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("You Suck Ballzs");
        System.out.println(welcomeText.getText());
    }
}