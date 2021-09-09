package DoublyLinkedList;

public class DoubleNode {
    private DoubleNode prev;
    private DoubleNode next;
    private char c;

    public DoubleNode(){
        this( null, '\0', null );
    }

    public DoubleNode(char ch){
        this(null, ch, null);
    }

    public DoubleNode(DoubleNode p, char ch, DoubleNode n){
        prev = p;
        next = n;
        c = ch;
    }

    public char getC(){
        return c;
    }

    public DoubleNode getNext(){
        return next;
    }

    public DoubleNode getPrev(){
        return prev;
    }

    public void setC(char ch){
        c = ch;
    }

    public void setNext(DoubleNode n){
        next = n;
    }

    public void setPrev(DoubleNode p){
        prev = p;
    }

    public String toString(){
        return Character.toString(c);
    }
}
