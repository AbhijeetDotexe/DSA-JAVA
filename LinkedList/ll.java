package com.abhijeet;

public class ll {

    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size = 0;
    }

    //Inserting elements at the beginning
    public void insertBeginning(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size += 1;
    }

    //Insert element at the last
    public void insertLast(int val){
        if (tail == null){
            insertBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;

    }

    //Insert an element in the linked list
    public void insert(int val, int index){

        if (index == 0){
            insertBeginning(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i <index ; i++) {
                temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }


    //Display the linked list
    public void dispay(){
        Node temp = head;
        while (temp!= null) {
            if (temp.next == null) {
                System.out.println(temp.value + " ");
                temp = temp.next;
            } else {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
        }
        System.out.println();
        System.out.println("End of Linked List ");
        System.out.println();

    }


    //Delete element from the beginning
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    //Get value of the node placed at a specific index
    public Node getIndex(int index){
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }

    //Delete the last element
    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast = getIndex(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    //Delete element at a specific index
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = getIndex(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;

    }

    //Find the node
    public Node find(int val){
        Node newNode = head;
        while (newNode!= null){
            if (newNode.value == val){
                return newNode;
            }
            newNode = newNode.next;
        }
        return null;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {

         ll list = new ll();
         list.insertBeginning(1);
         list.insertBeginning(2);
         list.insertBeginning(3);
         list.insertBeginning(4);
         list.insertBeginning(5);
         list.insertBeginning(6);
         list.insertLast(7);
         list.insert(23,3);
         list.dispay();
//         System.out.println(list.deleteFirst());
//         list.display();
         System.out.println(list.deleteLast());
         list.dispay();

        System.out.println(list.delete(4));
        list.dispay();

        System.out.println(list.find(23));
        list.find(23);
    }
}
