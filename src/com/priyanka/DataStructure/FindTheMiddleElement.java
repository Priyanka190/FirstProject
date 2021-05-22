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

    public void printMiddle()
    {
        Node ptr = head;
        Node ptr1 = head;
        if (head != null)
        {
            while (ptr != null && ptr.next != null)
            {
                ptr = ptr.next.next;
                ptr1 = ptr1.next;
            }
            System.out.println("The middle element is [" +
                    ptr1.data + "] \n");
        }
    }

    public String toString() {
        return "" + head;
    }
}