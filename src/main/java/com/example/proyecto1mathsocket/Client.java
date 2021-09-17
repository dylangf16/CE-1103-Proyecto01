package com.example.proyecto1mathsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    static Socket socket;
    static DataInputStream in;
    static DataOutputStream out;

    public static void main(String[] args) {


        try {
            Tablero_Controller pantalla = new Tablero_Controller();
            socket = new Socket("LocalHost", 4001);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            String msgin = "";

            while (!msgin.equals("exit")) {

                msgin = in.readUTF();
                System.out.println(msgin);
                pantalla.Respuesta_in.setText(pantalla.Respuesta_in.getText().trim() + msgin);

             }
            } catch(IOException e){}
        }
}