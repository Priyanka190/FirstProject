package com.priyanka.DataStructure;
class Stack {
    int top;
    int capacity;
    int[] data;
    public Stack(int capacity) {
        this.capacity=capacity;
        this.top=-1;
        data=new int[capacity];
        for(int i=0; i<capacity; i++) {
            data[i]=-1;
        }
    }
    public int pop() {
        int val;
        if(top==-1) {
            System.out.println("STACK IS OVERFLOW ");
            return -1;
        }
        else {
            val=data[top];
            top--;
            return  val;
        }
    }
    public void push(int val) {
        if(top==capacity) {
            System.out.println("STACK IS OVERFLOW");
        }
        else {
            top++;
            data[top]=val;
        }
    }
    public int peek() {
        if(top==-1) {
            System.out.println("underflow data");
            return -1;
        }
        return data[top];
    }
    public void display() {
        for(int i=top; i>=0; i--) {
            System.out.println(data[i]);
        }
    }

}
