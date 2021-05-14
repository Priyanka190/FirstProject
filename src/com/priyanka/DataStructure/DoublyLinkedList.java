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
    public void deleteAtStart() {
        if(head==null) {
            System.out.println("nothing has to be done");
        }
        else {
            Node temp=head;
            head=head.next;
            temp=null;
        }
    }
    public void deleteAtMid(int pos) {
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
           Node temp=n;
            temp.next.prev=temp.prev;
            temp.prev.next=temp.next;
        }
    }
    public void deleteAtEnd() {
        if(head==null) {
            System.out.println("nothing can be done");
        }
        else {
            Node n=head;
            while(n.next!=null) {
                n=n.next;
            }
         n.prev.next=null;
        }
    }
    public String toString() {
        return ""+head;
    }
}


