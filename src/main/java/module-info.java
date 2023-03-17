module com.example.se_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.se_2 to javafx.fxml;
    exports com.example.se_2;
}