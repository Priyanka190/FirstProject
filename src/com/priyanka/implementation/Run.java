package com.priyanka.implementation;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Run {
    public static void main(String[] agrs) throws FileNotFoundException,Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        SubString s = new SubString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        s.longestPalindrome(str);
    }
}