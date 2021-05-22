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

    public void insertionSort(int data) {
        Node ptr;
        ptr = head;
        Node prev = ptr;
        while (ptr != null && ptr.data < data) {
            prev = ptr;
            ptr = ptr.next;
        }
        Node temp = new Node(data);
        temp.next = ptr;
        if (ptr == head) {
            head = temp;
        } else {
            prev.next = temp;
        }
    }
    public String toString() {
        return "" + head;
    }
}