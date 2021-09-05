package hashtable;

import java.util.Arrays;

public class HashTable<String, V> {

    public LinkedList[] hashTable = new LinkedList[10];

    public void add(String key, V value) {
        int idx = hash(key);
        Node<String, V> nodeToAdd = new Node<String, V>(key, value);
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
        if (key == hashTable[idx].head.key) return (V) hashTable[idx].head.value;
        Node<String, V> current = hashTable[idx].head;
        while (current != null) {
            if (key == current.key) return current.value;
            current = current.next;
        }
        return null;
    }

    public boolean contains(String key) {
        int idx = hash(key);
        if (hashTable[idx] == null) return false;
        if (key == hashTable[idx].head.key) return true;
        Node<String, V> current = hashTable[idx].head;
        while (current != null) {
            if (key == current.key) return true;
            current = current.next;
        }
        return false;
    }

    public java.lang.String printOneBucket(String key) {
        int idx = hash(key);
        if (hashTable[idx] == null) return null;
        return hashTable[idx].toString();
    }

    @Override
    public java.lang.String toString() {
        return "hashTable =" + Arrays.toString(hashTable);
    }
}