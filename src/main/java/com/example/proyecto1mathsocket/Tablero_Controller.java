package com.example.proyecto1mathsocket;

import DoublyLinkedList.DoubleList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
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
    private Text Resul_Dado;

    @FXML
    private Rectangle Casilla1;

    @FXML
    private Rectangle Casilla2;

    @FXML
    private Rectangle Casilla3;

    @FXML
    private Button Btn_Iniciar;

    @FXML
    void Correcto(MouseEvent event) {

    }

    @FXML
    void Incorrecto(MouseEvent event) {

    }

    @FXML
    void Tirar_dado(MouseEvent event) {
        int valor = (int)(Math.random()*4 + 1);
        this.Resul_Dado.setText(String.valueOf(valor));
    }

    @FXML
    void Iniciar(MouseEvent event) {
        DoubleList Lista = new DoubleList();
        String Lista1 = Lista.creacion();
        String Lista2 = Lista1;
        System.out.println("Lista 1: " + Lista1);
        System.out.println("Lista 2: " + Lista2);
        Btn_Iniciar.setVisible(false);

    }
}


/*

        Pos1 = Cuadro1.getX();
        Pos2 = Cuadro2.getLayoutX();

        System.out.println("Posición X del Cuadro 1: " + Pos1);
        System.out.println("Posición X del Cuadro 1: " + Pos2);

        Cuadro1.setX(Pos2);
*/