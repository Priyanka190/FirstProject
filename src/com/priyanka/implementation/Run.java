package com.priyanka.implementation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Run {

    public static void main(String[] agrs) throws FileNotFoundException,Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int target=sc.nextInt();
        int[] a= new int[size];
        for(int i=0; i<size; i++) {
            a[i]=sc.nextInt();
        }
        fourSum f=new fourSum();
        List<List<Integer>> result =f.fourSum(a,target);
        System.out.println(result);
    }

}
