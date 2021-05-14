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
        System.out.println("enter 1 to be continued and 0 to be stop");
        int stop;
        stop=sc.nextInt();
        while(stop==1) {
            int operation;
            System.out.println("enter the desired operation number:");
            operation=sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("deletion at the starting:");
                    list.deleteAtStart();
                    System.out.println(list);
                    break;
                case 2:
                    System.out.println("deletion at given position:");
                    System.out.println("enter the position:");
                    int pos;
                    pos = sc.nextInt();
                    list.deleteAtMid(pos);
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println("deletion at the end of list:");
                    list.deleteAtEnd();
                    System.out.println(list);
                default:
                    System.out.println("Invaild input");
            }
            System.out.println("press 1 to continue:");
            stop = sc.nextInt();
        }
    }
}

