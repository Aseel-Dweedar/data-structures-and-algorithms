package hashtable;

import java.util.Arrays;

public class HashTable<V> {

    public LinkedList[] hashTable = new LinkedList[10];

    public void add(String key, V value) {
        int idx = hash(key);
        Node<V> nodeToAdd = new Node<V>(key, value);
        if (hashTable[idx] != null) nodeToAdd.next = hashTable[idx].head;
        else hashTable[idx] = new LinkedList();
        hashTable[idx].head = nodeToAdd;
    }

    public int hash(String key) {
        int idx = 0;
        char[] charArr = key.toString().toCharArray();
        for (int oneChar : charArr) {
            idx += oneChar;
        }
        return idx % hashTable.length;
    }

    public V get(String key) {
        int idx = hash(key);
        if (hashTable[idx] == null) return null;
        if (key.equals(hashTable[idx].head.key)) return (V) hashTable[idx].head.value;
        Node<V> current = hashTable[idx].head;
        while (current != null) {
            if (key.equals(current.key)) return current.value;
            current = current.next;
        }
        return null;
    }

    public boolean contains(String key) {
        int idx = hash(key);
        if (hashTable[idx] == null) return false;
        if (key.equals(hashTable[idx].head.key)) return true;
        Node<V> current = hashTable[idx].head;
        while (current != null) {
            if (key.equals(current.key)) return true;
            current = current.next;
        }
        return false;
    }

    public String printOneBucket(String key) {
        int idx = hash(key);
        if (hashTable[idx] == null) return null;
        return hashTable[idx].toString();
    }

    @Override
    public String toString() {
        return "hashTable =" + Arrays.toString(hashTable);
    }
}