package com.priyanka.implementation;

import com.priyanka.datastructure.linkedlist.Stack;

import javax.swing.plaf.metal.MetalBorders;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Run {
    public static void main(String[] agrs) throws FileNotFoundException, Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        Stack stack = new Stack(s.length());
        char element;
        boolean isValid=true;
        for (int i = 0; i < s.length(); i++) {
            element = s.charAt(i);
            if (element == '(' || element == '{' || element == '[') {
                stack.push1(element);
            } else if (element == ')') {
                if (stack.peek1() == '(') {
                    stack.pop1();
                }
                else {
                    System.out.println("unbalanced");
                    isValid=false;
                    break;
                }
            } else if (element == '}') {
                if (stack.peek1() == '{') {
                    stack.pop1();
                }
                else {
                    System.out.println("unbalanced");
                    isValid=false;
                    break;
                }
            } else if (element == ']') {
                if (stack.peek1() == '[') {
                    stack.pop1();
                }
                else{
                    System.out.println("unbalanced");
                    isValid=false;
                    break;
                }
            } else {
                System.out.println("unbalanced");
                isValid=false;
            }
        }
        if(stack.isEmpty() && isValid) {
            System.out.println("balanced");
        }else {
            System.out.println("invalid string");
        }
        stack.display1();
    }
}