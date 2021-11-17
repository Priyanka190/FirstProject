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
        int size  = sc.nextInt();
        int[] input = new int[size];
        for(int i=0; i<size; i++) {
            input[i] = sc.nextInt();
        }
        ThreeSum l  = new ThreeSum();
        List<Integer> result = new ArrayList<>(size);
        result=l.threeSum(input);
        System.out.println(result);
    }

}
