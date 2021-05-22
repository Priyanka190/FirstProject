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

   public void findLength() {
        Node ptr=head;
        int count=0;
        while(ptr!=null) {
            ptr=ptr.next;
            count++;
        }
        System.out.println("length of list: "+count);
   }

    public String toString() {
        return "" + head;
    }
}