package com.priyanka.DataStructure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Exception;

public class Run {
    public static void main(String[] ars) throws Exception {
        // Comment below two lines if you want to take input from the console
        // If you want to take input from the files then need to change the path of the files
        System.setIn(new FileInputStream("C:\\Users\\shesh\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\shesh\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
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

