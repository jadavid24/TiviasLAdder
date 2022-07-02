module com.example.triviasladder3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.triviasladder3 to javafx.fxml;
    exports com.example.triviasladder3;
    exports com.example.triviasladder3.controller;
    opens com.example.triviasladder3.controller to javafx.fxml;
}