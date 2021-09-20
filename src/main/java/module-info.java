module com.example.proyecto1mathsocket {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;


    opens com.example.proyecto1mathsocket to javafx.fxml;
    exports com.example.proyecto1mathsocket;
}