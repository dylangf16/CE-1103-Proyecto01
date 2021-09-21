package com.example.proyecto1mathsocket;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/*
Esta clase es la encargada de toda la programación interna de la ventana "Inicio"
 */

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
    void Conectar_Cliente(MouseEvent event){
        Btn_empezar.setVisible(true); //Activa botón para continuar
    }

    @FXML
    void Empezar_Juego(MouseEvent event) throws IOException { //Llama Clase Tablero_Application para poder ser ejecutada
        Tablero_Application Tablero = new Tablero_Application();
        Stage stage = new Stage();
        Tablero.start(stage);
    }

    @FXML
    void Iniciar_server(MouseEvent event) throws IOException {
        Btn_Cliente.setVisible(true); //Activa botón para continuar
        Txt_cliente.setText("Estado:");
        Estado_cliente.setText("Conectado");
    }
}
