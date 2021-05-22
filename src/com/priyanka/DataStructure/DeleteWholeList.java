package com.priyanka.DataStructure;

import java.util.Scanner;

class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(data);

        }
    }

    public void deletewholeList() {
        Node temp=head;
        Node ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            head=head.next;
        }
    }

    public String toString() {
        return "" + head;
    }
}