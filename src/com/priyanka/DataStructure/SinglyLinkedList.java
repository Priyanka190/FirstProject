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

    public void insertAtStart(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
        }

    }
    public void insertAtMiddle(int data, int pos){
        if(head==null) {
            System.out.println("no operation is done:\n");
        }
        else {
            Node n=head;
            int i=0;
            while(i<pos-1 && n!=null) {
                n=n.next;
                i++;
            }
            Node temp=new Node(data);
            temp.next=n.next;
            n.next=temp;
        }
    }
    public void insertAtEnd(int data) {
        if(head==null) {
            System.out.println("no operation is done:\n");
        }
        else {
            Node n=head;
            while(n.next!=null) {
                n=n.next;
            }
            n.next=new Node(data);
        }
    }



    public String toString() {
        return "" + head;
    }
}
