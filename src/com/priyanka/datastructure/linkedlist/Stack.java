package com.priyanka.datastructure.linkedlist;

public class Stack {
    char data[];
    int capacity;
    int top1;
    public Stack(int capacity) {
        this.capacity=capacity;
        this.top1=-1;
        data= new char[capacity];
        for(int i=0; i<capacity; i++) {
            data[i]='0';
        }
    }

    public char pop1() {
        char val;
        if (top1 == -1) {
            System.out.println("STACK IS UNDERFLOW ");
            return '0';
        } else {
            val = data[top1];
            top1--;
            return val;
        }
    }

    public void push1(char val) {
        if (top1 == capacity-1) {
            System.out.println("STACK IS OVERFLOW");
        } else {
            top1++;
            data[top1] = val;
        }
    }

    public char peek1() {
        if (top1 == -1) {
            System.out.println("underflow data");
            return '1';
        }
        return data[top1];
    }
    public boolean isEmpty() {
        if(top1==-1)   {
            return true;
        }
        else {
            return  false;
        }
    }

    public void display1() {
        for (int i = top1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
