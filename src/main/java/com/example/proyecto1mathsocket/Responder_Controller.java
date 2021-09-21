package com.example.proyecto1mathsocket;

import Server_Client.Client;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

/*
Esta clase es la encargada de toda la programación interna de la ventana "Responder"
 */

public class Responder_Controller {
    @FXML
    void Correcto(MouseEvent event) throws IOException {
        String total = Client.main("Correcto"); //Envía Correcto

    }

    @FXML
    void Incorrecto(MouseEvent event) throws IOException {
        Client.main("Incorrecto"); //Envía Correcto

    }


}
