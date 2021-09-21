package com.example.proyecto1mathsocket;

import DoublyLinkedList.AccederLista;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/*
Esta clase es el ejecutable de la clase "Responder_Controller"
 */

public class Responder_Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Responder_Application.class.getResource("Responder-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Ventana de respuesta!!!");
        stage.setScene(scene);
        stage.show();

        System.out.println("Lista desde el application: " + AccederLista.getInstance());
    }

    public static void main(String[] args) {
        launch();
    }
}