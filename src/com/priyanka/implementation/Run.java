package com.priyanka.implementation;
import com.priyanka.implementation.LongestCommonPrefix;
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
        String[] str = new String[size];
        for(int i=0; i<size; i++) {
            str[i] = sc.next();
        }
        LongestCommonPrefix l  = new LongestCommonPrefix();
        String pre=l.prefix(str);
        System.out.println(pre);
    }

}
