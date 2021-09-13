package graph;

import java.util.Objects;

public class Queue<T> {

    Node<T> front;
    Node<T> rear;

    public void enqueue(Node<T> node){
        if (front == null){
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }

    public Node<T> dequeue() {
        try {
            Node<T> temp = front;
            front = front.next;
            temp.next = null;
            return temp;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("The List is empty");
            return null;
        }
    }

    public Node<T> peek() {
        try {
            return front;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("The List is empty");
            return null;
        }
    }

    public boolean isEmpty(){
        if (front == null) return true;
        return false;
    }

    @Override
    public String toString() {
        if (front == null) return "null";
        String outList = "Front = ";
        Node<T> current = front;
        while (current != null){
            outList += current.value+ " -> ";
            current = current.next;
        }
        outList += "Null";
        return outList;
    }
}
