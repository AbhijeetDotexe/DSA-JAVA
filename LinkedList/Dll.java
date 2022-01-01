package com.abhijeet;

public class Dll {

   private Node head;

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    //Insert a node in the beginning of the dll
    public void insertBeg(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    //Insert a node at the end of the dll
    public void insertLast(int val){
        Node newNode = new Node(val);
        newNode.next = null;

        Node last = head;
        if (head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null){
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    //Inserting a new node after a node
    public void insert(int after, int val){
        Node p = find(after);
        if (p == null){
            System.out.println("There is no such list, OOPS!");
            return;
        }
        Node newNode = new Node(val);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if (newNode.next != null){
            newNode.next.prev = newNode;
        }
    }
    //Displaying the Doubly Linked list
    public void display(){
        Node newNode = head;
        while (newNode != null) {
            if (newNode.next == null) {
                System.out.print(newNode.val);
                return;
            } else {
                System.out.print(newNode.val + " -> ");
                newNode = newNode.next;
            }
        }
    }

    public Node find(int value){
        Node newNode = head;
        while (newNode != null){
            if (newNode.val == value){
                return  newNode;
            }
            newNode = newNode.next;
        }
        return null;
    }

    public static void main(String[] args) {

        Dll list = new Dll();
        list.insertBeg(6);
        list.insertBeg(5);
        list.insertBeg(4);
        list.insertBeg(3);
        list.insertBeg(2);
        list.insertBeg(1);
        list.insertLast(7);
        list.insert(5,23);
        list.display();
    }
}
