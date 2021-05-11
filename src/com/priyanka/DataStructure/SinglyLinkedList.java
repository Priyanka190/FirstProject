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

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("nothing would be done:\n");
        } else {
            head=head.next;
        }

    }
    public void deleteAtMiddle(int pos){
        if(head==null) {
            System.out.println("no operation is done:\n");
        }
        else {
            Node n=head;
            Node n1=head;
            int i=0;
            while(i<pos-1 && n!=null) {
                n=n1;
                n=n.next;
                i++;
            }
            n1.next=n.next;
            n.next=null;
        }
    }
    public void deleteAtEnd() {
        if(head==null) {
            System.out.println("no operation is done:\n");
        }
        else {
            Node n=head;
            Node n1=n;
            while(n.next!=null) {
                n1=n;
                n=n.next;
            }
            n1.next=null;
        }
    }



    public String toString() {
        return "" + head;
    }
}
