package com.priyanka.implementation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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
        twoSum l  = new twoSum();
        int target = sc.nextInt();
        int[] result = new int[2];
        result=l.twoSum(input,target);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
