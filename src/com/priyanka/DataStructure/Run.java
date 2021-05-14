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
    }
}

