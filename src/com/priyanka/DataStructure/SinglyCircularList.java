package com.priyanka.DataStructure;

public class SinglyCircularList {
    private Node head;
    public SinglyCircularList() {
        this.head = null;
    }
    public void add(int data) {
        Node temp = new Node(data);
        if(head == null) {
            head = temp;
            temp.next = head;
        }
        else {
            Node n = head;
            int i = 0;
            while(n.next != head) {
                n = n.next;
            }
            n.next = temp;
            temp.next = head;
        }
    }
    public String toString() {
        String result = "";
        Node curr = head;
        result += curr.data;
        curr = curr.next;
        while (curr!=head) {
            result += " " + curr.data;
            curr = curr.next;
        }
        result += " " + null;
        return result;
    }
}
