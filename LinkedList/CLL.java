package com.abhijeet;

public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    //Inserting a New Node at the beginning
    public void insertBeg(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    //Displaying the circular linked list
    public void display(){
        Node newNode = head;
        if (head !=null){
            do {
                System.out.print(newNode.val+ " -> ");
                newNode = newNode.next;
            }while (newNode != head);
        }
        System.out.println("HEAD");
    }

    //Deleting an element from the Circular linked list
    public void delete(int val){
        Node newNode = head;
        if (newNode == null){
            return;
        }
        if (newNode.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = newNode.next;
            if (n.val == val){
                newNode.next = n.next;
                break;
            }
            newNode = newNode.next;
        }while (newNode != head);
    }

    private class Node{

        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {

        CLL list = new CLL();
        list.insertBeg(6);
        list.insertBeg(5);
        list.insertBeg(4);
        list.insertBeg(3);
        list.insertBeg(2);
        list.insertBeg(1);
        list.insertBeg(0);
        list.delete(0);
        list.display();
    }
}
