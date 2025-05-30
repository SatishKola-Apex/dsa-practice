package com.example.practice;

import java.util.LinkedList;

public class Q06_MyHashMapImpl {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        // Insert key-value pairs
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        
        // Retrieve values
        System.out.println("Value for 'a': " + map.get("a")); // Output: 1
        System.out.println("Value for 'b': " + map.get("b")); // Output: 2
        
        // Resize HashMap when load factor exceeds
        map.put("e", 5);
        map.put("f", 6);
        
        // Output size after resizing
        System.out.println("Size of HashMap: " + map.size()); // Output: 6
    }
}

class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 4;
    private static final double LOAD_FACTOR = 0.75;

    // The internal bucket array
    private LinkedList<Node<K, V>>[] buckets;
    private int size;

    // Constructor
    public MyHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        size = 0;
        // Initialize the buckets with empty LinkedLists
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Node to store key-value pairs
    private static class Node<K, V> {
        K key;
        V value;
        
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash function to map the key to an index
    private int hash(K key) {
        return key.hashCode() % buckets.length;
    }

    // Put method to insert key-value pair into the HashMap
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        // Check if the key already exists in the bucket, if so update the value
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; // Update the value
                return;
            }
        }

        // If the key doesn't exist, add a new node
        bucket.add(new Node<>(key, value));
        size++;

        // Resize if necessary
        if (size >= buckets.length * LOAD_FACTOR) {
            resize();
        }
    }

    // Get method to retrieve the value for a given key
    public V get(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        // Look for the key in the bucket
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null; // Key not found
    }

    // Resize the HashMap when the load factor is exceeded
    private void resize() {
        System.out.println("Resizing HashMap...");

        // Create a new array with double the size
        LinkedList<Node<K, V>>[] newBuckets = new LinkedList[buckets.length * 2];
        for (int i = 0; i < newBuckets.length; i++) {
            newBuckets[i] = new LinkedList<>();
        }

        // Rehash all existing nodes into the new bucket array
        for (LinkedList<Node<K, V>> bucket : buckets) {
            for (Node<K, V> node : bucket) {
                int newIndex = node.key.hashCode() % newBuckets.length;
                newBuckets[newIndex].add(node);
            }
        }

        // Point to the new bucket array
        buckets = newBuckets;
    }

    // Helper method to get the current size
    public int size() {
        return size;
    }
}


