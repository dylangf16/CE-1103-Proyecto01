package com.example.proyecto1mathsocket;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Inicio_Controller {

    @FXML
    private Button Btn_Cliente;

    @FXML
    private Text Txt_cliente;

    @FXML
    private Button Btn_empezar;

    @FXML
    private Text Estado_cliente;

    @FXML
    void Conectar_Cliente(MouseEvent event) {
        Btn_empezar.setVisible(true);
    }

    @FXML
    void Empezar_Juego(MouseEvent event) {

    }

    @FXML
    void Iniciar_server(MouseEvent event) {
        Btn_Cliente.setVisible(true);
        Txt_cliente.setText("Estado:");
        Estado_cliente.setText("En espera");
    }
}
