package com.example.proyecto1mathsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Server extends IOException {
    public ServerSocket  server_socket = new ServerSocket(4001);
    public Socket socket = server_socket.accept();
    public DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    public DataInputStream in = new DataInputStream(socket.getInputStream());

    public Server() throws IOException {
    }


    public static String main(String[] args) throws IOException {

        Server server = new Server();
        Tablero_Controller pantalla = new Tablero_Controller();
        String msgin = "";
        try {

            while (!msgin.equals("exit")) {
                msgin = server.in.readUTF();
                System.out.println(msgin);
                pantalla.Respuesta_in.setText(pantalla.Respuesta_in.getText().trim() + msgin);
                return msgin;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Conexión cortada");
        return null;
    }


}