package com.abhijeet.StackAndQueues;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item){
        if (this.isFull()){
            //Double the array size
            int[] temp = new int[data.length * 2];

            //copy all the previous item in new data
            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        //at this point we know that array is not full
        //Insert item
        return super.insert(item);
    }
}
