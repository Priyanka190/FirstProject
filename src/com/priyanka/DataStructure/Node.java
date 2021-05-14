package com.priyanka.DataStructure;

class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public String toString() {
        return " " + data + " " + next;
    }
}
//1 2 3 4 5
//1
//1 2
//1 2 3
// 1 2 3 4
// 1 2 3 4 5-null4 5 null 4 5 null 4