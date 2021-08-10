package stack.and.queue;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    Queue catList = new Queue();
    Queue dogList = new Queue();

    public void enqueue(Animal animal) {
        if (animal instanceof Cat) {
            catList.enqueue(animal);
        } else if (animal instanceof Dog){
            dogList.enqueue(animal);
        }
    }

    public Object dequeue(String pref) {
        if (pref.equals("cat")) {
            return catList.dequeue();
        } else  if (pref.equals("dog")) {
            return dogList.dequeue();
        }
        return null;
    }

    @Override
    public String toString() {
        if (catList.isEmpty() && dogList.isEmpty()) {
            return null;
        }
        return "{Dog List :"+ dogList + "} --- {Cat List :"+ dogList + "}";
    }

}
