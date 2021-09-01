package com.priyanka.implementation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] agrs) throws FileNotFoundException,Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        int size;
        SalesMarket s = new SalesMarket();
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        List<Integer> input = new ArrayList<Integer>();
        for(int i=0; i<size; i++) {
            int temp=sc.nextInt();
            input.add(temp);
        }
       s.saleMatching(input,size);
    }
}
