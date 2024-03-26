package mylinkedlist;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head; 
    public LinkedList(){
        head = null;
    }
    public LinkedList(Node head){
        this.head = head;
    }

    public LinkedList(int key){
        this.head = new Node(key);
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    
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

    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.printList();

        list.append(4);
        list.printList();
    }
}

