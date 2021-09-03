package hashtable;

import java.util.Arrays;

public class HashTable<K, V> {

    public LinkedList[] hashTable = new LinkedList[10];

    public void add(K key, V value) {
        int idx = hash(key);
        Node<K,V> nodeToAdd = new Node<K,V>(key,value);
        if (hashTable[idx] != null) {
            nodeToAdd.next = hashTable[idx].head;
        }
        hashTable[idx] = new LinkedList();
        hashTable[idx].head = nodeToAdd;
    }

    public int hash(K key) {
        int idx = 0;
        char[] keyChar = key.toString().toCharArray();
        for (int oneChar : keyChar) {
            idx += oneChar;
        }
        return idx % 10;
    }

    public V get(K key) {
        int idx = hash(key);
        if (hashTable[idx] == null) return null;
        Node<K, V> current = hashTable[idx].head;
        while (current != null) {
            if (key == current.key) return current.value;
            current = current.next;
        }
        return null;
    }

    public boolean contains(K key) {
        int idx = hash(key);
        if (hashTable[idx] == null) return false;
        Node<K, V> current = hashTable[idx].head;
        while (current != null) {
            if (key == current.key) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return "hashTable =" + Arrays.toString(hashTable);
    }
}