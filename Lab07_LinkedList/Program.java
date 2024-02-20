//Step 1: Creation
//Step 2: Insertion
//Step 3: Deletion

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

class Node {
    public int data; 
    public Node next = null;    
}

//Step 1: define LinkedList class - Just first define the head of the list and print list method
//Step 2-a: add append method to add a new node at the end of the list
//Step 2-b: insert a node by index


class MyLinkedList {
    // Head node of the LinkedList
    public Node head;
    
    //append mehtod to add a new node at the end of the list
    public void append(int data) {
        // Create a new node with the given data
        Node newNode = new Node();
        newNode.data = data;
        // If the LinkedList is empty, set the head to the new node
        if (head == null) {
            head = newNode;
            return;
        }
        // Otherwise, traverse the LinkedList to find the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        // Set the next node of the last node to the new node
        last.next = newNode;
    }

    //insert a node by index
    public void insert(int index, int data) {
        // Create a new node with the given data
        Node newNode = new Node();
        newNode.data = data;
        // If the LinkedList is empty, set the head to the new node
        if (head == null) {
            head = newNode;
            return;
        }
        // If the index is 0, insert the new node at the beginning of the list
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        // Otherwise, traverse the LinkedList to find the node at the given index
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            // to avioid null pointer exception
            if (prev == null) {
                append(data);
                return;
            }
            prev = prev.next;
        }
        // Insert the new node after the node at the given index
        newNode.next = prev.next;
        prev.next = newNode;
    }

    //detect a node by key
    public void deleteByKey(int key) {
        // Store head node
        Node current = head, prev = null;
        // If head node itself holds the key to be deleted
        if (current != null && current.data == key) {
            head = current.next; // Changed head
            return;
        }
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change 'prev.next'
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        // If the key was not present in the LinkedList
        if (current == null)
            return;
        // Unlink the node from the LinkedList
        prev.next = current.next;
        current.next = null;
    }

    // Method to print all elements of the LinkedList
    public void printList() {
        // Start from the head node
        Node n = head;
        // Traverse the LinkedList until the end
        while (n != null) {
            // Print the data of the current node
            System.out.print(n.data + " ");
            // Move to the next node
            n = n.next;
        }

        System.out.println();
    }
}


 public class Program {

    public static void main(String[] args) {

        /*
         * Step 1: Create a new LinkedList
         */

        // Create a new LinkedList
        MyLinkedList list = new MyLinkedList();
        // Create a new node with data 1
        Node first = new Node();
        first.data = 1;
        // Set the head of the list to the first node
        list.head = first;
        // Create a second node with data 2
        Node second = new Node();
        second.data = 2;
        // Link the first node to the second node
        first.next = second;
        // Create a third node with data 3
        Node third = new Node();
        third.data = 3;
        // Link the second node to the third node
        second.next = third;
        // Print the LinkedList
        list.printList();

        /*
         * Step 2: Insert a new node at the end of the list
         */
        list.append(14);
        list.printList();
        
        list.insert(4, 0);
        list.printList();

        list.insert(3, 100);
        list.printList();

        list.insert(20, 500);
        list.printList();


        list.deleteByKey(100);
        list.printList();

        /*
         * comparing array list and linked list in terms of time for adding elements
         */
        //creat an array list and add 1000000 random numbers between 0-1000 to it
        ArrayList<Integer> arr = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        Random rand = new Random(); 
        rand.setSeed(12345);

        long startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            arr.add(rand.nextInt(1000));
        }
        long endTime = System.nanoTime();
        //show the time for the operation in milliseconds
        System.out.println("Time for ArrayList insertion: " + (endTime - startTime) / 1000000 + "ms");

        //do the same for the linked list
        startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(rand.nextInt(1000));
        }
        endTime = System.nanoTime();
        System.out.println("Time for LinkedList insertion: " + (endTime - startTime) / 1000000 + "ms");

        //remove the first 1000 elements from the array list and copute the time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arr.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("Time for ArrayList deletion: " + (endTime - startTime) / 1000000 + "ms");

        //do the same for the linked list
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("Time for LinkedList deletion: " + (endTime - startTime) / 1000000 + "ms");


    }
}
