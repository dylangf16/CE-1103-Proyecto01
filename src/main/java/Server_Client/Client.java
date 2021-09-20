package Server_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client  extends IOException {
    private static int PUERTO = 4001;
    private static String HOST = "127.0.0.1";
    private static DataInputStream in;
    private static DataOutputStream out;

    public Client() throws IOException {}

    public static String main(String respuesta) throws IOException {
        try {
            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            System.out.println("Conexion establecida");

            String entrada = in.readUTF();
            System.out.println(entrada);
            out.writeUTF("[Client]:" + respuesta);

            //sc.close();
            System.out.println("CLiente cerrado");
            return entrada;


        } catch(IOException e){
            System.out.println("Conexion establecida");
            String entrada = in.readUTF();
            System.out.println(entrada);
            out.writeUTF("[Client]:" + respuesta);

            //sc.close();
            System.out.println("CLiente cerrado");
        }
        return null;
    }
}
