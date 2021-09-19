package com.example.proyecto1mathsocket;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

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
        //Client client = new Client();
        //client.getClass();
        Btn_empezar.setVisible(true);
    }

    @FXML
    void Empezar_Juego(MouseEvent event) throws IOException {
        Tablero_Application Tablero = new Tablero_Application();
        Stage stage = new Stage();

        Tablero.start(stage);

    }

    @FXML
    void Iniciar_server(MouseEvent event) throws IOException {
       // Server server = new Server();
        Btn_Cliente.setVisible(true);
        Txt_cliente.setText("Estado:");
        Estado_cliente.setText("Conectado");
       // this.Estado_cliente.setText((Server.main(null)));
    }
}
