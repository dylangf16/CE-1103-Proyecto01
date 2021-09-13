package com.example.proyecto1mathsocket;

import DoublyLinkedList.AccederLista;
import DoublyLinkedList.DoubleList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
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
    private Circle Server_ficha;

    @FXML
    private Circle Cliente_ficha;

    @FXML
    private Text Posicion_Server;

    @FXML
    void Correcto(MouseEvent event) {

    }

    @FXML
    void Incorrecto(MouseEvent event) {

    }

    @FXML
    void Tirar_dado(MouseEvent event) {
        int valor = (int) (Math.random() * 4 + 1);
        int posicion = Integer.parseInt(Posicion_Server.getText());
        int movimiento = posicion + valor;
        this.Resul_Dado.setText(String.valueOf(valor));
        int Posicion1 = Integer.parseInt((Casilla_1.getId()));
        int Posicion2 = Integer.parseInt((Casilla_2.getId()));
        int Posicion3 = Integer.parseInt((Casilla_3.getId()));
        int Posicion4 = Integer.parseInt((Casilla_4.getId()));
        int Posicion5 = Integer.parseInt((Casilla_5.getId()));
        int Posicion6 = Integer.parseInt((Casilla_6.getId()));
        int Posicion7 = Integer.parseInt((Casilla_7.getId()));
        int Posicion8 = Integer.parseInt((Casilla_8.getId()));
        int Posicion9 = Integer.parseInt((Casilla_9.getId()));
        int Posicion10 = Integer.parseInt((Casilla_10.getId()));
        int Posicion11 = Integer.parseInt((Casilla_11.getId()));
        int Posicion12 = Integer.parseInt((Casilla_12.getId()));
        int Posicion13 = Integer.parseInt((Casilla_13.getId()));
        int Posicion14 = Integer.parseInt((Casilla_14.getId()));
        System.out.println("Posicion Server_Ficha" + posicion);


        System.out.println("Casilla a mover: " + movimiento);
        //Idea para moverse por el tablero
        if (movimiento == Posicion1){
            double Pos1 = Casilla_1.getLayoutX();
            double Pos2 = Casilla_1.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion2){
            double Pos1 = Casilla_2.getLayoutX();
            double Pos2 = Casilla_2.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion3) {
            double Pos1 = Casilla_3.getLayoutX();
            double Pos2 = Casilla_3.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2 - 170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion4){
            double Pos1 = Casilla_4.getLayoutX();
            double Pos2 = Casilla_4.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion5){
            double Pos1 = Casilla_5.getLayoutX();
            double Pos2 = Casilla_5.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion6){
            double Pos1 = Casilla_6.getLayoutX();
            double Pos2 = Casilla_6.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion7){
            double Pos1 = Casilla_7.getLayoutX();
            double Pos2 = Casilla_7.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion8){
            double Pos1 = Casilla_8.getLayoutX();
            double Pos2 = Casilla_8.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion9){
            double Pos1 = Casilla_9.getLayoutX();
            double Pos2 = Casilla_9.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion10){
            double Pos1 = Casilla_10.getLayoutX();
            double Pos2 = Casilla_10.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion11){
            double Pos1 = Casilla_11.getLayoutX();
            double Pos2 = Casilla_11.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion12){
            double Pos1 = Casilla_12.getLayoutX();
            double Pos2 = Casilla_12.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion13){
            double Pos1 = Casilla_13.getLayoutX();
            double Pos2 = Casilla_13.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
        if (movimiento == Posicion14){
            double Pos1 = Casilla_14.getLayoutX();
            double Pos2 = Casilla_14.getLayoutY();
            Server_ficha.setCenterX(Pos1 - 47);
            Server_ficha.setCenterY(Pos2-170);
            posicion +=valor;
            Posicion_Server.setText(String.valueOf(posicion));
        }
    }

    @FXML
    void Iniciar(MouseEvent event) {
        //Creación de lista dentro del controlador
        DoubleList Lista = new DoubleList();
        String Lista1 = Lista.creacion();
        System.out.println("Lista 1 desde el controlador: " + Lista1);

        //Desaparecer botón de Inicio
        Btn_Iniciar.setVisible(false);

        //Aparecer botones de juego
        Btn_Correcto.setVisible(true);
        Btn_Incorrecto.setVisible(true);
        Btn_Tirar.setVisible(true);
        System.out.println(Lista1.length());

        /*
        Establece un valor del Arraylist al texto de cada casilla
        Además, cambia la ID de cada texto para saber ubicación y futuro lugar de posición
        cada vez que el jugador se mueve
         */

        Casilla_1.setText(String.valueOf(Lista1.charAt(0)));
        Casilla_1.setId("1");

        //Establecer un valor de Array a cada casilla del tablero
        Casilla_2.setText(String.valueOf(Lista1.charAt(1)));
        Casilla_2.setId("2");

        Casilla_3.setText(String.valueOf(Lista1.charAt(2)));
        Casilla_3.setId("3");

        Casilla_4.setText(String.valueOf(Lista1.charAt(3)));
        Casilla_4.setId("4");

        Casilla_5.setText(String.valueOf(Lista1.charAt(4)));
        Casilla_5.setId("5");

        Casilla_6.setText(String.valueOf(Lista1.charAt(5)));
        Casilla_6.setId("6");

        Casilla_7.setText(String.valueOf(Lista1.charAt(6)));
        Casilla_7.setId("7");

        Casilla_8.setText(String.valueOf(Lista1.charAt(7)));
        Casilla_8.setId("8");

        Casilla_9.setText(String.valueOf(Lista1.charAt(8)));
        Casilla_9.setId("9");

        Casilla_10.setText(String.valueOf(Lista1.charAt(9)));
        Casilla_10.setId("10");

        Casilla_11.setText(String.valueOf(Lista1.charAt(10)));
        Casilla_11.setId("11");

        Casilla_12.setText(String.valueOf(Lista1.charAt(11)));
        Casilla_12.setId("12");

        Casilla_13.setText(String.valueOf(Lista1.charAt(12)));
        Casilla_13.setId("13");

        Casilla_14.setText(String.valueOf(Lista1.charAt(13)));
        Casilla_14.setId("14");

    }
}


