package hashtable;

public class Node<String,V> {
    public String key;
    public V value;
    public Node next;

    public Node(String key, V value) {
        this.key = key;
        this.value = value;
    }
}
