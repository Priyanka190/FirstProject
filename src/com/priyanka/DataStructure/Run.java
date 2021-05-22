package com.priyanka.DataStructure;

import java.util.Scanner;
import java.lang.Exception;

import java.util.Scanner;

public class Run {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("enter the num of node:\n");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int data = sc.nextInt();
            list.add(data);
        }
        list.deletewholeList();
        System.out.println(list);
    }
}
