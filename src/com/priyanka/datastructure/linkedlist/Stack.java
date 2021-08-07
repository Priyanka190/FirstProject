package com.priyanka.datastructure.linkedlist;

public class Stack {
    int data[];
    int capacity;
    int top1;
    int top2;
    public Stack(int capacity) {
        this.capacity=capacity;
        this.top1=-1;
        this.top2=capacity;
        data=new int[capacity];
        for(int i=0; i<capacity; i++) {
            data[i]=-1;
        }
    }

    public int pop1() {
        int val;
        if (top1 == -1) {
            System.out.println("STACK IS UNDERFLOW ");
            return -1;
        } else {
            val = data[top1];
            top1--;
            return val;
        }
    }

    public int pop2() {
        int val;
        if (top2 == capacity) {
            System.out.println("STACK IS UNDERFLOW ");
            return -1;
        } else {
            val = data[top2];
            top2++;
            return val;
        }
    }

    public void push1(int val) {
        if (top1 == top2 - 1) {
            System.out.println("STACK IS OVERFLOW");
        } else {
            top1++;
            data[top1] = val;
        }
    }

    public void push2(int val) {
        if (top2 - 1 == top1) {
            System.out.println("STACK IS OVERFLOW");
        } else {
            top2--;
            data[top2] = val;
        }
    }

    public int peek1() {
        if (top1 == -1) {
            System.out.println("underflow data");
            return -1;
        }
        return data[top1];
    }

    public int peek2() {
        if (top1 == capacity) {
            System.out.println("underflow data");
            return -1;
        }
        return data[top1];
    }

    public void display1() {
        for (int i = top1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public void display2() {
        for (int i = top2; i < capacity; i++) {
            System.out.println(data[i]);
        }
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
