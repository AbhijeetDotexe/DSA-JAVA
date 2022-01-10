package com.abhijeet.StackAndQueues;

import java.util.*;

public class InBuiltExamples {

    public static void main(String[] args) {

//        Stack Implementation
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());



//        Queue Implementation
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());


//        Deque Implementation
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.add(3);
        deque.addLast(5);
        deque.add(4);
        deque.addFirst(1);

        System.out.println(deque.removeLast());





    }


}
