module com.example.proyecto1mathsocket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto1mathsocket to javafx.fxml;
    exports com.example.proyecto1mathsocket;
}