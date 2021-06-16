package com.priyanka.implementation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Run {
    public static void main(String[] agrs) throws FileNotFoundException {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        MedianOfSortedArray m = new MedianOfSortedArray();
        m.input();
        int[] p = m.output();
        int median = m.medianOfTwoArray(p);
        System.out.println("");
        System.out.println(median);
    }
}
