package com.priyanka.DataStructure;
import java.util.Scanner;

public class DoublyLinkedList {
    Node head;
    public DoublyLinkedList() {
        this.head=null;
    }
    public void add(int data) {
        if(head==null) {
            head=new Node(data);
        }
        else {
            Node n=head;
            while(n.next!=null) {
                n=n.next;
            }
            Node temp;
            temp=new Node(data);
            temp.next= null;
            temp.prev=n;
            n.next=temp;
        }
    }
    public void insertAtStart(int data) {
        if(head==null) {
            head=new Node(data);
        }
        else {
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
        }
    }
    public void insertAtMid(int data,int pos) {
        if(head==null) {
            System.out.println("nothing to be performed");
        }
        else {
           Node n=head;
           int i=0;
            while(i<pos-1 && n.next!=null) {
                n=n.next;
                i++;
            }
            Node temp=new Node(data);
            temp.next=n.next;
            temp.prev=n;
            if(n.next!=null) {
                n.next.prev=temp;
                n.next=temp;
            }
        }
    }
    public void insertAtEnd(int data) {
        if(head==null) {
            System.out.println("nothing can be done");
        }
        else {
            Node n=head;
            while(n.next!=null) {
                n=n.next;
            }
            Node temp=new Node(data);
            temp.next=null;
            temp.prev=n;
            n.next=temp;
        }
    }
    public String toString() {
        return ""+head;
    }
}


