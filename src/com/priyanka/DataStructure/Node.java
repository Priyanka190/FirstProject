package com.priyanka.DataStructure;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public String toString() {
        return " " + data + " " + next;
    }
}
