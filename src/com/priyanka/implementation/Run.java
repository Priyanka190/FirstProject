package com.priyanka.implementation;
import com.priyanka.datastructure.linkedlist.Stack;
import javax.swing.plaf.metal.MetalBorders;
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
        String s;
        s = sc.next();
        Stack stack = new Stack(s.length());
        char element;
        for(int i=0; i<s.length(); i++) {
            element = s.charAt(i);
            if(element=='(') {
                stack.push1(element);
            }
            else {
                if(stack.peek1()=='(') {
                    int popped=stack.pop1();
                }
                else {
                    stack.push1(element);
                    System.out.println("unbalanced");
                }
            }
        }
        if(stack.isEmpty()==true) {
            System.out.println("balanced");
        }
        else {
            System.out.println("not");
        }
        stack.display1();
    }
}