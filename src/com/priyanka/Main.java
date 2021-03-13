package com.priyanka;

import com.priyanka.implementation.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int rollNo = sc.nextInt();
//        sc.next();
        String course = sc.next();
        Student s = new Student(name, rollNo, course);
        System.out.println(s);
    }
}
