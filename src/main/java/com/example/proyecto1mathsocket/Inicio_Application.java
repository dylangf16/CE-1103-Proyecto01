package com.example.proyecto1mathsocket;

import DoublyLinkedList.AccederLista;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Inicio_Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Tablero_Application.class.getResource("Inicio-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Math Socket VideoGame!!!");
        stage.setScene(scene);
        stage.show();
        System.out.println("Lista desde el application: " + AccederLista.getInstance());
    }

    public static void main(String[] args) {
        launch();
    }
}