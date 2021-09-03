package hashtable;

import java.util.Arrays;

public class HashTable<K, V> {

    public LinkedList[] hashTable = new LinkedList[10];

    public void add(K key, V value) {
        int idx = hash(key);
        Node<K, V> nodeToAdd = new Node<K, V>(key, value);
        if (hashTable[idx] != null) nodeToAdd.next = hashTable[idx].head;
        else hashTable[idx] = new LinkedList();
        hashTable[idx].head = nodeToAdd;
    }

    public int hash(K key) {
        int idx = 0;
        char[] charArr = key.toString().toCharArray();
        for (int oneChar : charArr) {
            idx += oneChar;
        }
        return idx % hashTable.length;
    }

    public V get(K key) {
        int idx = hash(key);
        if (hashTable[idx] == null) return null;
        if (key == hashTable[idx].head.key) return (V) hashTable[idx].head.value;
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
        if (key == hashTable[idx].head.key) return true;
        Node<K, V> current = hashTable[idx].head;
        while (current != null) {
            if (key == current.key) return true;
            current = current.next;
        }
        return false;
    }

    public String printOneBucket(K key){
        int idx = hash(key);
        if (hashTable[idx] == null) return null;
        return hashTable[idx].toString();
    }

    @Override
    public String toString() {
        return "hashTable =" + Arrays.toString(hashTable);
    }
}