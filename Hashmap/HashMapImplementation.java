package Hashmap;

import java.util.*;

public class HashMapImplementation<K, V> {
    static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int n; // Number of elements in the HashMap
    private int N; // Number of buckets
    private LinkedList<Node<K, V>>[] buckets; // Array of linked lists to store key-value pairs

    @SuppressWarnings("unchecked")
    public HashMapImplementation() {
        this.N = 4;
        this.buckets = new LinkedList[4];
        for (int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    // Hash function to determine the bucket index for a given key
    private int hashFunction(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % buckets.length;
    }

    // Search for a key in the linked list within a specific bucket
    private int searchInLL(K key, int bi) {
        LinkedList<Node<K, V>> ll = buckets[bi];
        int di = 0;

        for (int i = 0; i < ll.size(); i++) {
            Node<K, V> node = ll.get(i);
            if (node.key.equals(key)) {
                return di;
            }
            di++;
        }
        return -1;
    }

    // Rehash the HashMap when the load factor exceeds a threshold
    @SuppressWarnings("unchecked")
    private void rehash() {
        LinkedList<Node<K, V>>[] oldBuckets = buckets;
        buckets = new LinkedList[N * 2];
        N = N * 2;

        for (int i = 0; i < N; i++) {
            buckets[i] = new LinkedList<>();
        }

        // Move nodes from old buckets to the resized buckets
        for (int i = 0; i < oldBuckets.length; i++) {
            LinkedList<Node<K, V>> ll = oldBuckets[i];
            for (int j = 0; j < ll.size(); j++) {
                Node<K, V> node = ll.remove();
                put(node.key, node.value);
            }
        }
    }

    // Put a key-value pair into the HashMap
    public void put(K key, V value) {
        int bi = hashFunction(key); // Compute the bucket index
        int di = searchInLL(key, bi); // Search for the key in the linked list

        if (di != -1) {
            Node<K, V> node = buckets[bi].get(di);
            node.value = value; // Update the value if the key already exists
        } else {
            buckets[bi].add(new Node<>(key, value)); // Add a new node for the key-value pair
            n++;

            double loadFactor = (double) n / N;
            if (loadFactor > 2.0) {
                rehash(); // Rehash if the load factor exceeds the threshold
            }
        }
    }

    // Check if the HashMap contains a specific key
    public boolean containsKey(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
        return di != -1;
    }

    // Get the value associated with a key
    public V get(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if (di != -1) {
            Node<K, V> node = buckets[bi].get(di);
            return node.value;
        } else {
            return null;
        }
    }

    // Remove a key-value pair from the HashMap
    public V remove(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if (di != -1) {
            Node<K, V> node = buckets[bi].remove(di);
            n--;
            return node.value;
        } else {
            return null;
        }
    }

    // Get a list of all keys in the HashMap
    public ArrayList<K> keySet() {
        ArrayList<K> keys = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            LinkedList<Node<K, V>> ll = buckets[i];
            for (Node<K, V> node : ll) {
                keys.add(node.key);
            }
        }

        return keys;
    }

    // Check if the HashMap is empty
    public boolean isEmpty() {
        return n == 0;
    }

    public static void main(String[] args) {
        // Example usage of the HashMapImplementation
        HashMapImplementation<String, Integer> hm = new HashMapImplementation<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
