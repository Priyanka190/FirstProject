package com.priyanka.DataStructure;

import java.util.Scanner;
import java.lang.Exception;

public class Run {
    public static void main(String[] ars) throws Exception {
        Scanner sc = new Scanner(System.in);
        SinglyCircularList list = new SinglyCircularList();
        System.out.println("enter the num of node:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.add(data);
        }
        System.out.println(list);
    }
}

