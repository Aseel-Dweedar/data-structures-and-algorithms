package hashtable;

public class LinkedList<K,V> {

    Node<K,V> head;

    public String toString(){
        String result = " [ ";
        Node<K,V> current = head;
        while (current != null) {
            result  += "{"+ current.key+ ":" + current.value + "} ";
            current = current.next;
        }
        result  += "] ";
        return result;
    }
}
