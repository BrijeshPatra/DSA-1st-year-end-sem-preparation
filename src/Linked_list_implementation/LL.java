package Linked_list_implementation;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to add a new node to the end of the linked list
    public void addNodeLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addNodeFirst(int data) {
        Node newNode=new Node(data);
        newNode.next=head;

        head=newNode;
    }

    public void insertAtPos(int data,int pos){
        Node head=null;
        Node toAdd=new Node(data);

        if(pos==0){
            toAdd.next=head;
            head=toAdd;
        }
        Node prev=head;
        for (int i=0;i<pos-1;i++){
            prev=prev.next;
        }
        toAdd.next=prev.next;
        prev.next=toAdd;
    }

    public void deleteFirst(Node head){
        if(head==null){
            System.out.println("Underflow");
        }
        Node curr=head;
        head=head.next;
    }

    public void deleteLast(Node head){
        if(head==null){
            System.out.println("Underflow");
        }
        Node second_last=head;
        while (second_last.next.next!=null){
            second_last=second_last.next;

            second_last.next=null;
        }

    }
    public void deleteAtPos(Node head,int pos){
        if(pos==0){
            head=head.next;
        }
        Node prev=head;
        for (int i=0;i<pos-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNodeLast(1);
        list.addNodeLast(2);
        list.insertAtPos(2,5);
        list.printList();

        System.out.println("Linked List:");
        list.printList();
    }
}
