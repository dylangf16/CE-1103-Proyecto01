package Server_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends IOException {
    private static ServerSocket servidor;
    private static Socket sc;
    private static DataInputStream in;
    private static DataOutputStream out;
    private static int PUERTO = 4001;

    public static String enviar(int entero) throws IOException {
        try {
            servidor = new ServerSocket(PUERTO);
            sc = servidor.accept();
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            System.out.println("Conexion Establecida");
            String entrada ="";

            String msg = String.valueOf(entero);
            out.writeUTF("[Server]:" + msg);
            entrada = in.readUTF();
            System.out.println("Server Cerrado");

            servidor.close();
            return entrada;

        } catch(IOException e){
            servidor = new ServerSocket(PUERTO);
            sc = servidor.accept();
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            System.out.println("Conexion Establecida");

            String msg = String.valueOf(entero);
            out.writeUTF("[Server]:" + msg);
            String entrada = in.readUTF();
            System.out.println("Server Cerrado");
            servidor.close();
        }
        String entrada = enviar(entero);
        return entrada;
    }
}
