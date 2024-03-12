
class Node {
    public int data;
    public Node next = null;
}

class MyLinkedList {
    public Node head;

    public void prepend(int data) {
        /*
        * prepend() add data at the beginning of the linkedlist
        */

        // 1. create a new node
        Node newNode = new Node();
        newNode.data = data;
        
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void append(int data) {
        /*
         * append() add data at the end of the linkedlist
         */

        // 1. create a new node
        Node newNode = new Node();
        newNode.data = data;

        // 2. if head is null then assign new node as head
        if (head == null){
            head = newNode;
            return;
        }        

        // 3. Traverse your linked list to find the last node
        Node last = head; 
        while (last.next != null) {
            last = last.next;
        } 

        // 4. last.next = newNode
        last.next = newNode;

    }
    
    public void insertByIndex(int index, int data) {
        // creat a new node
        Node newNode = new Node(); 
        newNode.data = data; 

        // if head == null ; head = newNode
        if(head == null) {
            head = newNode;
            return;
        }
        //if index == 0 
        if (index == 0) {
            newNode.next = head; 
            head = newNode;
            return;
        }

        //otherwise: the general case //find the node in index - 1; preNode
        Node prevNode = new Node();
        prevNode = head;
        for (int i = 0; i < index - 1; i++) {
           prevNode = prevNode.next; 
        }
        
        //break the connection and make new connections
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void deleteByKey(int key) {
        //create two nodes: prev and target
        Node target; 
        Node prev = null; 

        target = head;
        //Case 1: if you want to delete the head
        if (target != null && target.data == key) {
            head = target.next;
            return;
            
        }
        //General case
        while (target != null && target.data != key) {
            prev = target; 
            target = target.next;            
        }

        //It is an empty list OR the key not found
        if (target == null) {
            return;
        }

        prev.next = target.next;
        target.next = null;

    }
    
    public void printList() {
        Node n = head;
        while(n != null){
            System.out.print(" " + n.data + " ");
            n = n.next;
        }

        System.out.println();
    }


}

public class Program {

    public static void main(String[] args) {
        // 7 ==> 5 ==> 3
        Node firstNode = new Node();
        firstNode.data = 7;
        Node secondNode = new Node();
        secondNode.data = 5;
        Node thirdNode = new Node();
        thirdNode.data = 3;

        MyLinkedList list = new MyLinkedList();
        list.head = firstNode;

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        list.printList();

        

        // current 7 ==> 5 ==> 3 
        // prepend 8 ==> 7 ==> 5 ==> 3
        list.prepend(8);
        list.printList();  
        
        list.append(25);
        list.printList();

        list.insertByIndex(2, 11);
        list.printList();

        list.insertByIndex(5, 99);
        list.printList();

        list.deleteByKey(3);
        list.printList();

        list.deleteByKey(8);
        list.printList();


        
        
    }
}