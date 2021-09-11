package DoublyLinkedList;

//Singleton para el Arraylist
public class AccederLista {
    private static AccederLista log;
    private String value;

    private AccederLista(){
    }

    public static AccederLista getInstance() {
        if (log == null) {
            log = new AccederLista();
        }
        System.out.println("Hay una nueva instancia: " + log);
        return log;
    }

    public void log(String msg){
        System.out.println(msg);
    }
}

