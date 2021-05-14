package com.priyanka.DataStructure;

public class SinglyCircularList {
    private Node head;
    public SinglyCircularList() {
        this.head = null;
    }
    public void add(int data) {
        if(head == null) {
            Node temp = new Node(data);
            head = temp;
            temp.next = head;
            System.out.println("line 13 "+head.data);

        }
        else {
            Node n = head;
            int i = 0;
            while(n.next != head) {
                System.out.println("line 19 "+ n.data);//1
                n = n.next;
            }
            System.out.println("line 24 "+ n.data);//1
            Node temp = new Node(data);
            System.out.println("line 25 "+ temp.data);//2
            n.next = temp;
            System.out.println("line 27 "+ n.data+"\t"+n.next.data);//1 2
            temp.next = head;
            System.out.println("line 27 "+ temp.data+"\t"+temp.next.data);//2 1
        }
    }
    public String toString() {
        return " " + head;
    }
}
