package com.example.proyecto1mathsocket;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

public class HelloController {

    @FXML
    private Rectangle Cuadro1;

    @FXML
    private Rectangle Cuadro2;

    @FXML
    void CambiarPos(MouseEvent event) {
        double Pos1, Pos2;
        Pos1 = Cuadro1.getX();
        Pos2 = Cuadro2.getLayoutX();
        //Pos2 ++;
        System.out.println("Posición X del Cuadro 1: " + Pos1);
        System.out.println("Posición X del Cuadro 1: " + Pos2);

        Cuadro1.setX(Pos2);

    }

}
