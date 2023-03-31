package com.example.se_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.concurrent.ConcurrentLinkedDeque;

public class TableArea {

    private final TableView table = new TableView();
    private ObservableList data = FXCollections.observableArrayList();

    public TableArea() {

        TableColumn<Contact, String> firstNameCol = new TableColumn<>("First Name");
        TableColumn<Contact, String> lastNameCol = new TableColumn<>("Last Name");
        TableColumn<Contact, String> phoneNumberCol = new TableColumn<>(" Phone Number");
        table.getColumns().addAll(firstNameCol, lastNameCol, phoneNumberCol);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Contact, String>("firstName")
        );
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Contact, String>("lastName")
        );
        phoneNumberCol.setCellValueFactory(
                new PropertyValueFactory<Contact, String>("number")
        );

        table.setEditable(true);
    }

    public void addContact(String firstName, String lastName, String phoneNumber) {
        data.addAll(new Contact(firstName, lastName, phoneNumber));
        table.setItems(data);
    }

    public Node getPane() {
        return this.table;
    }
}
