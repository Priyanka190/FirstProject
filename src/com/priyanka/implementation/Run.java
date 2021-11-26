package com.priyanka.implementation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] agrs) throws FileNotFoundException,Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        Scanner sc = new Scanner(System.in);
        twoSum l  = new twoSum();
        float balance = sc.nextFloat();
        int amount = sc.nextInt();
        float totalBalnce=0;
        totalBalnce=l.atm(amount,balance);
        System.out.println(totalBalnce);
    }

}
