package com.example.proyecto1mathsocket;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Tablero_Controller {

    @FXML
    private Pane Casilla5;

    @FXML
    private Text Operación;

    @FXML
    private TextField Respuesta_out;

    @FXML
    private Text Respuesta_in;

    @FXML
    private Button Correcto;

    @FXML
    private Button Incorrecto;

    @FXML
    private Button Tirar_dado;

    @FXML
    private Text Resul_Dado;

}

/*
        Pos1 = Cuadro1.getX();
        Pos2 = Cuadro2.getLayoutX();

        System.out.println("Posición X del Cuadro 1: " + Pos1);
        System.out.println("Posición X del Cuadro 1: " + Pos2);

        Cuadro1.setX(Pos2);
*/