package com.priyanka.DataStructure;

class Node {
    int data;
    Node next;
    int index;
    public Node(int data,int index) {
        this.data = data;
        this.next = null;
        this.index=index;
    }
    public String toString() {
        return " [" + data + "][ " + index +"] -> " + next;
    }
}