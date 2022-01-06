package com.abhijeet.LinkedList;

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

        //Insert Using recursion
        public void insertRec(int val, int index){

            head = insertRec(val, index, head);
        }

        private Node insertRec(int val, int index, Node node){
            if (index == 0) {
                Node temp = new Node(val, node);
                size++;
                return temp;
            }
            node.next = insertRec(val, index-=1, node.next);
            return node;

        }
        //Display the linked list
        public void display(){
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

            public Node(){

            }

        }



       //Questions
    //Q1 Remove duplicates from a linked list
    public void duplicates(){
            Node newNode = head;
            while (newNode.next != null){
                if (newNode.value == newNode.next.value){
                    newNode.next = newNode.next.next;
                    size--;
                }else {
                    newNode = newNode.next;
                }
            }
            tail = newNode;
            tail.next = null;
    }

    //Q2 Merge two linked list
    public static ll mergell(ll first, ll second){
            Node f = first.head;
            Node s = second.head;

            ll ans = new ll();
            while (f != null && s != null){
                if (f.value < s.value){
                    ans.insertLast(f.value);
                    f = f.next;
                }else {
                    ans.insertLast(s.value);
                    s = s.next;
                }
            }

            while (f != null){
                ans.insertLast(f.value);
                f = f.next;
            }

            while (s != null){
                ans.insertLast(s.value);
                s = s.next;
            }
            return ans;
    }



    //Q3 Linked List Cycle
    public boolean hasCycle(Node head){
            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow){
                    return true; //Cycle is present
                }
            }
            return false;
    }

    //Q4 Find the length of the liked list cycle
    public int lengthCycle(Node head){
            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow){
                    //This will only work if the cycle is present in the linked list
                    //Calculating the length of the cycle
                    Node temp = slow;
                    int length = 0;
                    do {
                        temp = temp.next;
                        length++;
                    }while (temp != slow);
                    return length;
                }
            }
            return 0; // there is no cycle in the linked list
    }


    //Q5 Detect cycle
    public Node detectCycle(Node head){
            int length = 0;
            Node fast = head;
            Node slow = head;
            while (fast!=null && fast.next != null){
                fast = fast.next.next;
                slow = fast.next;
                if (fast == slow){
                    length = lengthCycle(slow);
                }
            }
            if (length == 0){
                return null;
            }
            //Find the start Node
            Node f = head;
            Node s = head;

            while (length > 0){
                s = s.next;
                length--;
            }

            //Keep moving both forward till they will meet at cycle start
            while (f!=s){
                f =f.next;
                s = s.next;
            }
            return s;
    }


    //Q6 is happy
    public boolean isHappy(int n){
            int slow = n;
            int fast = n;

            do {
                slow = findSquare(slow);
                fast = findSquare(findSquare(fast));
            }while (slow != fast);

            if (slow == 1) {
                return true;
            }
                return false;

    }
    private int findSquare(int number){
            int ans = 0;
            while (number > 0){
                int rem = number % 10;
                ans += rem * rem;
                number /= 10;
            }
            return ans;
    }


    //Q7 Middle of the linked list
    public Node middleNode(Node head){
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
    }

    //Q8 Merge Sort a given linked list
    public Node merge(Node first, Node second){
        Node f = first;
        Node s = second;

        Node ans = new Node();
        Node tail = ans;
        while (f != null && s != null){
            if (f.value < s.value){
                tail.next =f;
                f = f.next;
                tail = tail.next;
            }else {
                tail.next = s;
                s = s.next;
                tail = tail.next;
            }
        }

        while (f != null){
            tail.next =f;
            f = f.next;
        }

        while (s != null){
            tail.next = s;
            s = s.next;
        }
        return ans;
    }
    public Node sortList(Node head){
            if (head == null && head.next != null){
                return head;
            }

            Node mid = middleNode(head);
            Node left = sortList(head);
            Node right = sortList(mid);
            return merge(left, right);
    }

    //Sorting a given linked list using bubble sort
    public void bubbleSort(){
            bubbleSort(size-1,0);
    }

    private void bubbleSort(int row, int col){

            if (row == 0){
                return;
            }
            if (col < row){
                Node first = getIndex(col);
                Node second = getIndex(col+1);

                if (first.value > second.value){
                    //swap
                    if (first == head){
                        head = second;
                        first.next = second.next;
                        second.next = first;
                    }else if (second == tail){
                        Node prev = getIndex(col - 1);
                        prev.next = second;
                        tail = first;
                        first.next = null;
                        second.next = tail;
                    }else {
                        Node prev = getIndex(col -1);
                        prev.next = second;
                        first.next = second;
                        second.next = first;
                    }
                }
                bubbleSort(row,col+1);
            }else {
                bubbleSort(row - 1, 0);
            }
    }


    //Q9 Reversing a linked list
    //Using recursion
    public void reverseRec(Node node){
            if (node == tail){
                head = tail;
                return ;
            }
            reverseRec(node.next);
            tail.next = node;
            tail = node;
            tail.next = null;
    }

    //In place reversal of linked list
    public Node reverseInPlace(Node head){
            if (size < 2){
                return null;
            }

            if (head == null){
                return head;
            }
            Node prev = null;
            Node present = head;
            Node next = present.next;

            while (present != null){
                present.next = prev;
                prev = present;
                present = next;
                if (next != null){
                    next = next.next;
                }
            }
            return prev;

    }

    //Q10 Reverse Linked list from between
    public Node reverseBetween(Node head, int left, int right){
            if (left == right){
                return head;
            }

            //Skip the first left - 1 Nodes
            Node current = head;
            Node prev = null;
            for (int i = 0;current != null && i <left-1 ; i++) {
                prev = current;
                current = current.next;
        }

            Node last = prev;
            Node newEnd = current;
        // Reverse between left and right
        Node next = current.next;
        for (int i = 0; i < right - left ; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }
        if (last != null){
            last.next = prev;
        }else {
            head = prev;
        }

        newEnd.next = prev;
        return head;
    }

    //Q11 Check whether a given linked list is a palindrome or not
    public boolean isPalindrome(Node head){
            Node mid = middleNode(head);
            Node headSecond = reverseInPlace(mid);
            Node reReverseHead = headSecond;

            //Compare both the halves
        while (head != null && headSecond != null){
            if (head.value != headSecond.value){
                break;
            }

            head = head.next;
            headSecond = headSecond.next;

        }
        reverseInPlace(reReverseHead);

        if (head == null || headSecond == null){
            return true;
        }
        return false;
    }


    //Q12 ReOrder List
    public void reOrderList(Node head){
            if (head == null || head.next == null){
                return;
            }

            Node mid = middleNode(head);

            Node hs = reverseInPlace(mid);
            Node hf = head;

            //Rearrange
            while (hf != null && hs != null){

                Node temp = hf.next;
                hf.next = hs;
                head = temp;

                temp = hs.next;
                hs.next = hf;
                hs = temp;


                //Setting the value of tail to null
                if (hf != null){
                    hf.next = null;
                }
            }





    }

    //Q14 Reverse nodes in k groups
    public Node reverseGroup(Node head, int k){
            if (k <= 1 && head != null){
                return head;
            }
            Node current = head;
            Node prev = null;

            while (true){

                Node last = prev;
                Node newEnd = current;
                // Reverse between left and right
                Node next = current.next;
                for (int i = 0; i < k ; i++) {
                    current.next = prev;
                    prev = current;
                    current = next;
                    if (next != null){
                        next = next.next;
                    }
                }
                if (last != null){
                    last.next = prev;
                }else {
                    head = prev;
                }

                newEnd.next = current;

                if (current == null){
                    break;
                }
                prev = newEnd;
            }
        return head;

    }

    //Q15 Rotate the linked list
    public Node rotateRight(Node head, int k){
            if (k<=0 || head == null || head.next == null){
                return head;
            }

            Node last = head;
            int length = 1;
            while (last.next != null){
                last = last.next;
                length++;
            }
            last.next = head;

            int rotation = k % length;
            int skip = length - rotation;
            Node newLast = head;
            for (int i = 0; i < skip - 1 ; i++) {
                newLast = newLast.next;
            }

            head = newLast.next;
            newLast.next = null;
            
            return head;
    }







    public static void main(String[] args) {

     ll first = new ll();
     ll second = new ll();
     ll ans = new ll();
     first.insertLast(1);
     first.insertLast(3);
     first.insertLast(5);
     first.insertLast(7);
     second.insertLast(2);
     second.insertLast(4);
     second.insertLast(6);
     second.insertLast(8);
     ans = mergell(first, second);
     ans.display();



    }


}

