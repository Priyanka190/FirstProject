package com.priyanka.implementation;

import com.priyanka.datastructure.linkedlist.SinglyList;
import com.priyanka.datastructure.linkedlist.Node;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Run {
    public void merge(SinglyList list, SinglyList list1) {
        Node ptr = list.head;
        Node ptr1 = list1.head;
        int count = 0;
        while(ptr.next!=null) {
            ptr=ptr.next;
            count++;
        }
        ptr.next= list1.head;
    }
    public void polynomial(SinglyList list) {
        for(Node ptr= list.head; ptr!=null; ptr=ptr.next) {
            Node prev=ptr;
            for(Node ptr1= ptr.next; ptr1!=null; ptr1=ptr1.next) {
                if(ptr1.deg == ptr.deg) {
                    ptr.data = ptr1.data + ptr.data;
                    prev.next=ptr1.next;
                }
                else {
                    prev = ptr1;
                }
            }
        }
    }

    public static void main(String[] agrs) throws FileNotFoundException,Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        Scanner sc = new Scanner(System.in);
        SinglyList list = new SinglyList();
        SinglyList list1 = new SinglyList();
        System.out.println("enter the num of node for the 1st list :\n");
        int n = sc.nextInt();
        System.out.println("size: "+n);
        System.out.println("enter the num of node for the 2nd list :\n");
        int m= sc.nextInt();
        Run r =new Run();
        System.out.println("size: "+m);
        for(int i=0; i<n; i++) {
            int data = sc.nextInt();
            int deg = sc.nextInt();
            list.add(data,deg);
        }
        for(int i=0; i<m; i++) {
            int data = sc.nextInt();
            int deg1 = sc.nextInt();
            list1.add(data,deg1);
        }
        System.out.println(list1);
        System.out.println(list);
        System.out.println("MERGE: ");
        r.merge(list, list1);
        System.out.println(list);
        System.out.println("ADDITION OF POLYNOMIAL: ");
        r.polynomial(list);
        System.out.println(list);

    }
}
