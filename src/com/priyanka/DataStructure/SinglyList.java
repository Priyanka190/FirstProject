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

    public void searchElement(int data) {
        Node ptr=head;
        while(ptr!=null) {
            if(ptr.data==data) {
                System.out.println("found the data:\t"+ptr.data);
                break;
            }
            else {
                ptr=ptr.next;
            }
        }
        System.out.println("data does not exist");
    }

    public String toString() {
        return "" + head;
    }
}