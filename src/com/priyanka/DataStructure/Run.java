package com.priyanka.DataStructure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class Run {
    public static void main(String[] agrs) throws FileNotFoundException,Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        Stack st = new Stack(size);
        for(int i=0; i<size; i++) {
           int val = sc.nextInt();
            st.push(val);
        }
        int currentTop=st.peek();
        System.out.println("currentTop -> "+currentTop);
        st.display();
    }
}
