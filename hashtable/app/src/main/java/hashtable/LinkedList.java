package hashtable;

public class LinkedList<String,V> {

    Node<String,V> head;

    public java.lang.String toString(){
        java.lang.String result = " [ ";
        Node<String,V> current = head;
        while (current != null) {
            result  += "{"+ current.key+ ":" + current.value + "} ";
            current = current.next;
        }
        result  += "] ";
        return result;
    }
}
