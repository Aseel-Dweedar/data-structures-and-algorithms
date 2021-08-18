package trees;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {


    public T value;
    public Node leftChild;
    public Node rightChild;
    public Node next;
    public List<Node> child = new ArrayList<>();


    public Node(T value) {
        this.value = value;
    }

    public Node() {}


    public Node(T value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}


