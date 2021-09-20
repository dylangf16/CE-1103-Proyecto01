package com.example.proyecto1mathsocket;

import Server_Client.Client;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.IOException;

public class Responder_Controller {

    @FXML
    private Button Btn_Tirar;

    @FXML
    private Text resultado;

    @FXML
    void Correcto(MouseEvent event) throws IOException {
        String total = Client.main("correcto");
        resultado.setText(total);

    }

    @FXML
    void Incorrecto(MouseEvent event) throws IOException {
        Client.main("Incorrecto");

    }

    @FXML
    void Tirar_dado(MouseEvent event) {

    }

}
