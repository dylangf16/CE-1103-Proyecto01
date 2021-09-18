package Server_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends IOException {
    ServerSocket server_socket = new ServerSocket(4001);
    Socket socket = server_socket.accept();

    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());
    public Socket connect_socket(){return socket;}
    public ServerSocket connect_ServerSocket(){return server_socket;}
    public Server() throws IOException {}

    public static String enviar(int entero){
        try {
            Server func = new Server();
            System.out.println("Conexion Establecida");
            Scanner scanner = new Scanner(System.in);
            String entrada ="";

            while (!entrada.equals("exit")) {
                func.connect_ServerSocket();
                func.connect_socket();
                String msg = String.valueOf(entero);
                func.out.writeUTF("[Server]:" + msg);
                entrada = func.in.readUTF();
                System.out.println(entrada);
                scanner.close();
                return entrada;
            }
        } catch(IOException e){}
        return null;
    }
}
