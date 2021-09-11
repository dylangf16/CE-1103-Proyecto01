package com.example.proyecto1mathsocket;

import DoublyLinkedList.DoubleList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Tablero_Controller {

    @FXML
    private Text Operación;

    @FXML
    private TextField Respuesta_out;

    @FXML
    private Text Respuesta_in;

    @FXML
    private Button Btn_Correcto;

    @FXML
    private Button Btn_Incorrecto;

    @FXML
    private Rectangle Inicio;

    @FXML
    private Button Btn_Tirar;

    @FXML
    private Text Resul_Dado;

    @FXML
    private Button Btn_Iniciar;

    @FXML
    private Text Casilla_1;

    @FXML
    private Text Casilla_2;

    @FXML
    private Text Casilla_3;

    @FXML
    private Text Casilla_4;

    @FXML
    private Text Casilla_5;

    @FXML
    private Text Casilla_6;

    @FXML
    private Text Casilla_7;

    @FXML
    private Text Casilla_8;

    @FXML
    private Text Casilla_9;

    @FXML
    private Text Casilla_10;

    @FXML
    private Text Casilla_11;

    @FXML
    private Text Casilla_12;

    @FXML
    private Text Casilla_13;

    @FXML
    private Text Casilla_14;

    @FXML
    private Rectangle Rectangulo_1;

    @FXML
    void Correcto(MouseEvent event) {

    }

    @FXML
    void Incorrecto(MouseEvent event) {

    }

    @FXML
    void Tirar_dado(MouseEvent event) {
        int valor = (int) (Math.random() * 4 + 1);
        String amover = String.valueOf(valor);

        this.Resul_Dado.setText(String.valueOf(valor));
        String Posicion1 = String.valueOf(Casilla_1.getId());
        System.out.println(valor);
        System.out.println(Casilla_1.getId());


        //Idea para moverse por el tablero
        if (amover.equalsIgnoreCase(Posicion1)) {
            System.out.println("MoverAqui");
        }
    }

    @FXML
    void Iniciar(MouseEvent event) {
        //Creación de lista dentro del controlador
        DoubleList Lista = new DoubleList();
        String Lista1 = Lista.creacion();
        String Lista_Copia = Lista1;
        System.out.println("Lista 1 desde el controlador: " + Lista1);

        //Desaparecer botón de Inicio
        Btn_Iniciar.setVisible(false);

        //Aparecer botones de juego
        Btn_Correcto.setVisible(true);
        Btn_Incorrecto.setVisible(true);
        Btn_Tirar.setVisible(true);
        System.out.println(Lista1.length());

        //Cambiar ID del Texto (posible método de ubicación para moverse por el tablero)
        Casilla_1.setText(String.valueOf(Lista1.charAt(0)));
        Casilla_1.setId("1");

        //Establecer un valor de Array a cada casilla del tablero
        Casilla_2.setText(String.valueOf(Lista1.charAt(1)));
        Casilla_3.setText(String.valueOf(Lista1.charAt(2)));
        Casilla_4.setText(String.valueOf(Lista1.charAt(3)));
        Casilla_5.setText(String.valueOf(Lista1.charAt(4)));
        Casilla_6.setText(String.valueOf(Lista1.charAt(5)));
        Casilla_7.setText(String.valueOf(Lista1.charAt(6)));
        Casilla_8.setText(String.valueOf(Lista1.charAt(7)));
        Casilla_9.setText(String.valueOf(Lista1.charAt(8)));
        Casilla_10.setText(String.valueOf(Lista1.charAt(9)));
        Casilla_11.setText(String.valueOf(Lista1.charAt(10)));
        Casilla_12.setText(String.valueOf(Lista1.charAt(11)));
        Casilla_13.setText(String.valueOf(Lista1.charAt(12)));
        Casilla_14.setText(String.valueOf(Lista1.charAt(13)));

    }
}


/*
        Ideas para moverse por el tablero

        *************

        Pos1 = Cuadro1.getX();
        Pos2 = Cuadro2.getLayoutX();

        System.out.println("Posición X del Cuadro 1: " + Pos1);
        System.out.println("Posición X del Cuadro 1: " + Pos2);

        Cuadro1.setX(Pos2);
*/