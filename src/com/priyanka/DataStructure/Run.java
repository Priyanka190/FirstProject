package com.priyanka.DataStructure;

import java.util.Scanner;
import java.lang.Exception;

public class Run {
    public static void main(String[] ars) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("enter the num of node:\n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.add(data);
        }
        System.out.println(list);
        int operation;
        System.out.println("enter the desired operation number:");
        operation=sc.nextInt();
        switch(operation) {
            case 1:System.out.println("insert at the starting:\n");
                System.out.println("enter data:\n");
                int data=sc.nextInt();
                list.insertAtStart(data);
                System.out.println(list);
                break;
            case 2:System.out.println("insert at given position:\n");
                System.out.println("enter the position:\n");
                int pos;
                pos=sc.nextInt();
                System.out.println("enter data:\n");
                data=sc.nextInt();
                list.insertAtMid(data,pos);
                System.out.println(list);
                break;
            case 3:System.out.println("insert at the end of list:\n" );
                System.out.println("enter data:\n");
                data=sc.nextInt();
                list.insertAtEnd(data);
                System.out.println(list);
        }
    }
}

