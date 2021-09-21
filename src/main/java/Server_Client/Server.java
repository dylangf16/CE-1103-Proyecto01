package Server_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends IOException {
    private static ServerSocket servidor;
    private static Socket sc;
    private static DataInputStream in;
    private static DataOutputStream out;
    private static int PUERTO = 4001;

    public static String enviar(String entero) throws IOException {
        try {
            /*
            Inicia el servidor para realizar la conexión por Socket con el cliente
             */
            servidor = new ServerSocket(PUERTO);
            sc = servidor.accept();
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            System.out.println("Conexion Establecida");
            String entrada ="";

            //Envío y recepción del mensaje
            String msg = String.valueOf(entero);
            out.writeUTF("[Server]:" + msg); //Envío
            entrada = in.readUTF();//Recepción
            System.out.println("Server Cerrado");

            servidor.close();
            return entrada;

        } catch(IOException e){
            /*
            Es necesario tener el mismo código aquí, ya que, si se envía algo por el mismo puente varias veces, se va a ejecutar esta parte del código
            y no la anterior
            Se ejecuta el código anterior
             */
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
