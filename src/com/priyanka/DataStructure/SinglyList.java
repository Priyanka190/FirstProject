package com.priyanka.DataStructure;

import java.util.Scanner;

class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int data,int index) {
        if (head == null) {
            head = new Node(data,index);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(data,index);

        }
    }

    public void nthElement(int index) {
        Node ptr = head;
        int count = 0;
        while (ptr != null) {
            if (count == index) {
                System.out.println("required element:" + ptr.data);
                break;
            }
            count++;
            ptr = ptr.next;
        }
    }

    public String toString() {
        return "" + head;
    }
}