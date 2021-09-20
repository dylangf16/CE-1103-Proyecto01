package com.example.proyecto1mathsocket;

import DoublyLinkedList.DoubleList;
import Server_Client.Server;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Tablero_Controller {

    @FXML
    private Text num1;

    @FXML
    private TextField Respuesta_out;

    @FXML
    public Text Respuesta_in;

    @FXML
    private Button Btn_Correcto;

    @FXML
    private Button Btn_Incorrecto;

    @FXML
    private Rectangle Inicio;

    @FXML
    private Rectangle Rectangulo_1;

    @FXML
    private Button Btn_Tirar;

    @FXML
    private Text Resul_Dado;

    @FXML
    private Button Btn_Iniciar;

    @FXML
    private Text Casilla_1;

    @FXML
    private Text Casilla_Final;

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
    public Text Casilla_9;

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
    private Circle Server_ficha;

    @FXML
    private Circle Cliente_ficha;

    @FXML
    private Text Posicion_Cliente;

    @FXML
    private Text Posicion_Server;

    @FXML
    private Text turno;

    @FXML
    private Text Operación;

    @FXML
    private Text num2;


    @FXML
    void Tirar_dado(MouseEvent event) {
        //Valores de movimiento
        int valor = (int) (Math.random() * 4 + 1);
        int posicion_server = Integer.parseInt(Posicion_Server.getText());
        int posicion_cliente = Integer.parseInt(Posicion_Cliente.getText());
        int movimiento_server = posicion_server + valor;
        int movimiento_cliente = posicion_cliente + valor;
        this.Resul_Dado.setText(String.valueOf(valor));
        int simbolo = (int) (Math.random()*4+1);

        //ID de las casillas para saber donde mover la ficha
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

        boolean Turno = Boolean.parseBoolean(turno.getText());
        /*
        True = turno del server
        False = turno del cliente
         */

        System.out.println("Turno de: " + turno.getText());
        if (Turno){
            if (movimiento_server == Posicion1){
                double Pos1 = Casilla_1.getLayoutX();
                double Pos2 = Casilla_1.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_1.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_1.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_1.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion2){
                double Pos1 = Casilla_2.getLayoutX();
                double Pos2 = Casilla_2.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_2.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_2.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_2.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion3) {
                double Pos1 = Casilla_3.getLayoutX();
                double Pos2 = Casilla_3.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_3.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_3.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_3.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion4){
                double Pos1 = Casilla_4.getLayoutX();
                double Pos2 = Casilla_4.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_4.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_4.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_4.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion5){
                double Pos1 = Casilla_5.getLayoutX();
                double Pos2 = Casilla_5.getLayoutY();
                Server_ficha.setCenterX(Pos1-150);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_5.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_5.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                }
                if (Casilla_5.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion6){
                double Pos1 = Casilla_6.getLayoutX();
                double Pos2 = Casilla_6.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_6.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_6.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_6.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion7){
                double Pos1 = Casilla_7.getLayoutX();
                double Pos2 = Casilla_7.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_7.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_7.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_7.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion8){
                double Pos1 = Casilla_8.getLayoutX();
                double Pos2 = Casilla_8.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_8.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_8.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_8.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion9){
                double Pos1 = Casilla_9.getLayoutX();
                double Pos2 = Casilla_9.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_9.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_9.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_9.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion10){
                double Pos1 = Casilla_10.getLayoutX();
                double Pos2 = Casilla_10.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_10.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_10.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_10.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion11){
                double Pos1 = Casilla_11.getLayoutX();
                double Pos2 = Casilla_11.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_11.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_11.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_11.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion12){
                double Pos1 = Casilla_12.getLayoutX();
                double Pos2 = Casilla_12.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_12.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_12.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_12.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion13){
                double Pos1 = Casilla_13.getLayoutX();
                double Pos2 = Casilla_13.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_13.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_13.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_13.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server == Posicion14){
                double Pos1 = Casilla_14.getLayoutX();
                double Pos2 = Casilla_14.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server +=valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                if (Casilla_14.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_14.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_14.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_server > Posicion14){
                double Pos1 = Casilla_Final.getLayoutX();
                double Pos2 = Casilla_Final.getLayoutY();
                Server_ficha.setCenterX(Pos1-182);
                Server_ficha.setCenterY(Pos2-170);
                posicion_server += valor;
                Posicion_Server.setText(String.valueOf(posicion_server));
                turno.setText(String.valueOf(false));
                System.out.println("El Servidor gana!");
                Btn_Tirar.setVisible(false);
            }
        }

        else{
            if (movimiento_cliente == Posicion1){
                double Pos1 = Casilla_1.getLayoutX();
                double Pos2 = Casilla_1.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2 -170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_1.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_1.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_1.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion2){
                double Pos1 = Casilla_2.getLayoutX();
                double Pos2 = Casilla_2.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2 -170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_2.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_2.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_2.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion3) {
                double Pos1 = Casilla_3.getLayoutX();
                double Pos2 = Casilla_3.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2 -170);
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_3.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_3.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_3.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion4){
                double Pos1 = Casilla_4.getLayoutX();
                double Pos2 = Casilla_4.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2 -170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_4.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_4.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_4.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion5){
                double Pos1 = Casilla_5.getLayoutX();
                double Pos2 = Casilla_5.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_5.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_5.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_5.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion6){
                double Pos1 = Casilla_6.getLayoutX();
                double Pos2 = Casilla_6.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_6.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_6.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_6.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion7){
                double Pos1 = Casilla_7.getLayoutX();
                double Pos2 = Casilla_7.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_7.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_7.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_7.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion8){
                double Pos1 = Casilla_8.getLayoutX();
                double Pos2 = Casilla_8.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_8.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_8.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_8.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion9){
                double Pos1 = Casilla_9.getLayoutX();
                double Pos2 = Casilla_9.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_9.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_9.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_9.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion10){
                double Pos1 = Casilla_10.getLayoutX();
                double Pos2 = Casilla_10.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_10.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_10.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_10.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion11){
                double Pos1 = Casilla_11.getLayoutX();
                double Pos2 = Casilla_11.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_11.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_11.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_11.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion12){
                double Pos1 = Casilla_12.getLayoutX();
                double Pos2 = Casilla_12.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_12.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_12.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_12.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion13){
                double Pos1 = Casilla_13.getLayoutX();
                double Pos2 = Casilla_13.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2-170);
                posicion_cliente +=valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_13.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_13.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_13.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }
            if (movimiento_cliente == Posicion14) {
                double Pos1 = Casilla_14.getLayoutX();
                double Pos2 = Casilla_14.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2 - 170);
                posicion_cliente += valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                if (Casilla_14.getText().equalsIgnoreCase("T")){
                    System.out.println("La casilla es Trampa");
                }
                if (Casilla_14.getText().equalsIgnoreCase("R")){
                    System.out.println("La casilla es Reto");
                    num1.setText(String.valueOf((int)(Math.random()*50+1)));
                    num2.setText(String.valueOf((int)(Math.random()*50+1)));

                    if (simbolo == 1){ //Suma
                        Operación.setText("+");
                    }
                    if (simbolo == 2){ //Resta
                        Operación.setText("-");
                    }
                    if (simbolo == 3){ //Multiplicación
                        Operación.setText("*");
                    }
                    if (simbolo == 4){ //División
                        Operación.setText("/");
                    }
                }
                if (Casilla_14.getText().equalsIgnoreCase("U")) {
                    System.out.println("La casilla es Túnel");
                }
            }

            if (movimiento_cliente > Posicion14){
                double Pos1 = Casilla_Final.getLayoutX();
                double Pos2 = Casilla_Final.getLayoutY();
                Cliente_ficha.setCenterX(Pos1 - 250);
                Cliente_ficha.setCenterY(Pos2 - 170);
                posicion_cliente += valor;
                Posicion_Cliente.setText(String.valueOf(posicion_cliente));
                turno.setText(String.valueOf(true));
                System.out.println("El Cliente gana!");
                Btn_Tirar.setVisible(false);
            }
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

    @FXML
    void Enviar_server(MouseEvent event) throws IOException {
        System.out.println("-------------------- Se envía dato ---------------------");
        Server sv = new Server();
        String respuesta = sv.enviar(Integer.parseInt(Respuesta_out.getText()));
        Respuesta_in.setText(respuesta);
        System.out.println("-------------------- Dato recibido ---------------------");

    }

}


