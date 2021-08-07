package com.priyanka.implementation;

import com.priyanka.datastructure.linkedlist.Stack;

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
        Stack st = new Stack(5);
        st.push1(3);
        st.push1(5);
        st.push2(2);
        st.push2(4);
        st.push2(6);
        st.push2(8);
        st.push2(10);
        System.out.println("line 23 "+st.pop1());
        System.out.println("line 24 "+st.pop1());
        System.out.println("line 25 "+st.pop1());
        st.push2(8);
        st.push2(10);
        st.push2(12);
        st.display();
    }
}
