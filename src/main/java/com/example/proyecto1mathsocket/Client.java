package com.example.proyecto1mathsocket;

import DoublyLinkedList.DoubleList;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        final String HOST = "127.0.0.1";
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;

        try {
            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getInputStream()); //Variable que permite recibir mensajes mediante sockets
            out = new DataOutputStream(sc.getOutputStream()); //Variable que perminte enviar un mensaje mediante sockets

            String mensaje = in.readUTF();
            System.out.println(mensaje);

            out.writeUTF("Hola desde el cliente");
            sc.close();


        } catch (IOException e){

        }
    }
}
