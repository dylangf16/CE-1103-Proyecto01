package Server_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Server extends IOException {
    ServerSocket server_socket = new ServerSocket(4001);
    Socket socket = server_socket.accept();

    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    DataInputStream in = new DataInputStream(socket.getInputStream());
    public Socket connect_socket(){return socket;}
    public ServerSocket connect_ServerSocket(){return server_socket;}
    public Server() throws IOException {}

    public static void main(String[] args)throws IOException {
        try {
            Server func = new Server();
            System.out.println("Conexion Establecida");
            Scanner scanner = new Scanner(System.in);
            //func.connect_ServerSocket();
            //func.connect_socket();
            while (true) {
                String msg = scanner.nextLine();
                func.out.writeUTF("[Server]:" + msg);
                String entranda = func.in.readUTF();
                System.out.println(entranda);
            }
        } catch(UnknownHostException e){} catch(IOException e){}
    }
}
