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
    public String toString() {
        return ""+head;
    }
}


