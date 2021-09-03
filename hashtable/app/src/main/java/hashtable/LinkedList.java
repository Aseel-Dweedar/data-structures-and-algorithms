package hashtable;

public class LinkedList<K,V> {

    Node<K,V> head;

    public String toString(){
        String result = " [ ";
        Node<K,V> current = head;
        while (current != null) {
            result = result + "{"+ current.key+ ":" + current.value + "} ";
            if (current.next == null) {
                result = result + "] ";
                return result;
            }
            current = current.next;
        }
        return result;
    }
}
