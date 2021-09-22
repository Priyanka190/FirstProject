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
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int price = sc.nextInt();
        List<Integer> a = new ArrayList<>(size);
        for(int i=0; i<size; i++) {
            int k= sc.nextInt();
            a.add(k);
        }
        Sorting s = new Sorting();
        s.bubbleSort(a,price);
//        s.selectionSort(arr);
;
    }

}
