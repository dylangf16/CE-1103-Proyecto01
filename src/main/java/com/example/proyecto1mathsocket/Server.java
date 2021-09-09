package com.example.proyecto1mathsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataInputStream stdIn;
        DataOutputStream out;

        final int PUERTO = 5000;
        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado. . .");
            while (true){
                sc = servidor.accept();
                in = new DataInputStream(sc.getInputStream()); //Variable que permite recibir mensajes mediante sockets
                out = new DataOutputStream(sc.getOutputStream()); //Variable que perminte enviar un mensaje mediante sockets
                out.writeUTF("Conexión Establecida con el cliente");
                String recibir = in.readUTF();
                System.out.println(recibir);
                sc.close();
                System.out.println("Server cerrado");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Conexión cortada");
    }

}