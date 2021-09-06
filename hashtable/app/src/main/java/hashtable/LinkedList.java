package hashtable;

public class LinkedList<V> {

    Node<V> head;

    public java.lang.String toString(){
        java.lang.String result = " [ ";
        Node<V> current = head;
        while (current != null) {
            result  += "{"+ current.key+ ":" + current.value + "} ";
            current = current.next;
        }
        result  += "] ";
        return result;
    }
}
