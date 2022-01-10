package com.abhijeet.StackAndQueues;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); //It will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); //It will call CustomStack(int size)
    }

    @Override
    public boolean push(int item){
        //if the array is full
        if (this.isFull()){
            //Double the array size
            int[] temp = new int[data.length * 2];
            
            //copy all the previous item in new data
            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point we know that array is not full
        //Insert item
        return super.push(item);
    }
}
