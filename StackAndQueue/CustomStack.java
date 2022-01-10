package com.abhijeet.StackAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full, OOPS!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot pop from empty stack !!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }


    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot peek from empty stack !!");
        }
        return data[ptr];
    }
    boolean isFull(){
        return ptr == data.length - 1;//ptr is at last index
    }

    private boolean isEmpty(){
        return ptr == -1;//ptr is at the first index
    }
}
