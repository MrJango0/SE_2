package com.example.se_2;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class EditArea {
    private final AnchorPane anchorPane = new AnchorPane();
    private final Button deleteButton = new Button();
    private final Button addButton = new Button();

    public EditArea(){
        AnchorPane.setLeftAnchor(addButton, 10.0);
        AnchorPane.setTopAnchor(addButton, 10.0);
        AnchorPane.setRightAnchor(addButton, 330.0);
        AnchorPane.setBottomAnchor(addButton, 10.0);
        addButton.setText("add contact");

        AnchorPane.setLeftAnchor(deleteButton, 330.0);
        AnchorPane.setTopAnchor(deleteButton, 10.0);
        AnchorPane.setRightAnchor(deleteButton, 10.0);
        AnchorPane.setBottomAnchor(deleteButton, 10.0);
        deleteButton.setText("delete contact");

        anchorPane.getChildren().addAll(addButton, deleteButton);
    }

    public Node getPane(){
        return anchorPane;
    }
}
