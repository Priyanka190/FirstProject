package com.priyanka.datastructure.linkedlist;

public class SinglyList {
    public Node head;

    public SinglyList() {
        this.head = null;
    }

    public void add(int data,int deg) {
        if (head == null) {
            head = new Node(data,deg);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(data,deg);

        }
    }

    public String toString() {
        return "" + head;
    }
}