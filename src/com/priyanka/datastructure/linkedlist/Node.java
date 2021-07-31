package com.priyanka.datastructure.linkedlist;

public class Node {
    public int data;
    public int deg;
    public Node next;
    public Node(int data, int deg) {
        this.data = data;
        this.deg = deg;
        this.next = null;
    }
    public String toString() {
        return "[ " + data+" "+ deg +"] -> "+next;
    }
}
