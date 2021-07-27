package com.priyanka.DataStructure;
class Stack {
    int top;
    int capacity;
    Node[] data;
    public Stack(int capacity) {
        this.capacity=capacity;
        this.top=-1;
        data=new Node[capacity];
        for(int i=0; i<capacity; i++) {
            data[i]=null;
        }
    }
    public Node pop() {
        Node val;
        if(top==-1) {
            System.out.println("STACK IS OVERFLOW ");
            return null;
        }
        else {
            val=data[top];
            top--;
            return  val;
        }
    }
    public void push(Node node) {
        if(top==capacity) {
            System.out.println("STACK IS OVERFLOW");
        }
        else {
            top++;
            data[top]= node;
        }
    }
    public Node peek() {
        if(top==-1) {
            System.out.println("underflow data");
            return null;
        }
        return data[top];
    }
    public void display() {
        for(int i=top; i>=0; i--) {
            System.out.println(data[i]);
        }
    }

}
