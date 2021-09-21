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
            /*
            Inicia el cliente para realizar la conexión por Socket con el cliente
             */
            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            System.out.println("Conexion establecida");

            String entrada = in.readUTF();
            System.out.println(entrada);
            out.writeUTF(respuesta);

            //sc.close();
            System.out.println("CLiente cerrado");
            return entrada;


        } catch(IOException e){
             /*
            Es necesario tener el mismo código aquí, ya que, si se envía algo por el mismo puente varias veces, se va a ejecutar esta parte del código
            y no la anterior
            Se ejecuta el código anterior
             */
            System.out.println("Conexion establecida");
            String entrada = in.readUTF();
            System.out.println(entrada);
            out.writeUTF(respuesta);

            //sc.close();
            System.out.println("CLiente cerrado");
        }
        return null;
    }
}
