package Server_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client  extends IOException {
    public Socket socket = new Socket("LocalHost",4001);
    public DataInputStream in = new DataInputStream(socket.getInputStream());
    public DataOutputStream out = new DataOutputStream(socket.getOutputStream());

    public Socket connect_socket(){return socket;}
    public Client() throws IOException {}

    public static void main(String[] args) throws IOException {


        try {


            Client func = new Client();
            System.out.println("Conexion establecida");
            Scanner scanner = new Scanner(System.in);



            while (true) {
                func.connect_socket();
                String msg = scanner.nextLine();
                func.out.writeUTF("[Client]:" + msg);
                String entrada = func.in.readUTF();
                System.out.println(entrada);


            }
        } catch(UnknownHostException e){} catch(IOException e){}
    }
}
