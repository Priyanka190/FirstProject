package com.priyanka.DataStructure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Exception;

public class Run {
    public void Addition(SinglyLinkedList list, SinglyLinkedList list2,SinglyLinkedList list3) {
        Node ptr=list.head;
        Node ptr1=list2.head;
        int n=0;
        int count=0;
        int count1=0;
        while(ptr!=null) {
            count++;
            ptr=ptr.next;
        }
        while(ptr1!=null) {
            count++;
            ptr1=ptr1.next;
        }
        ptr=list.head;
        ptr1=list2.head;
        int carry=0;
        int sum=0;
        int rem=0;
        while (ptr != null & ptr1 != null) {
            sum = ptr.data + ptr1.data + n;
            carry = sum / 10;
            rem = sum % 10;
            list3.add(rem);
            n=0;
            n=n + carry;
            ptr = ptr.next;
            ptr1 = ptr1.next;
        }
        if(ptr1==null) {
            while(ptr!=null) {
                sum = ptr.data +n;
                carry = sum / 10;
                rem = sum % 10;
                list3.add(rem);
                n=0;
                n=n + carry;
                ptr = ptr.next;
            }
            list3.add(n);
        }
        else if(ptr==null) {
            while(ptr1!=null) {
                sum = ptr1.data +n;
                carry = sum / 10;
                rem = sum % 10;
                list3.add(rem);
                n=0;
                n=n + carry;
                ptr1 = ptr1.next;
            }
            list3.add(n);
        }

    }
    public static void main(String[] agrs) throws Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList list3 = new SinglyLinkedList();
        Run r =new Run();
        System.out.println("enter the num of node in first list:");
        int n = sc.nextInt();
        SinglyLinkedList list2 = new SinglyLinkedList();
        System.out.println("enter 1st List :");
        for(int i=0; i<n; i++) {
            int data = sc.nextInt();
            list.add(data);
        }
        System.out.println(list);
        System.out.println("Enter the num of node in second list:");
        int n1 = sc.nextInt();
        System.out.println("enter 2st List :");
        for(int i=0; i<n1; i++) {
            int data = sc.nextInt();
            list2.add(data);
        }
        System.out.println(list2);
        System.out.println("3rd list");
        r.Addition(list,list2,list3);
        System.out.println(list3);
    }
}
