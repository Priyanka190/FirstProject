package com.priyanka.DataStructure;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next=null;
    }
    public String toString() {
        return "" + data;
    }
}
//1 2 3 4 5
//1
//1 2
//1 2 3
// 1 2 3 4
// 1 2 3 4 5-null4 5 null 4 5 null 4