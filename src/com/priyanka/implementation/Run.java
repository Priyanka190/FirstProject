package com.priyanka.implementation;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;

public class Run {
    public static void main(String[] agrs) throws FileNotFoundException, Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        Stack<Character> stack = new Stack();
        char element;
        boolean isValid=true;
        for (int i = 0; i < s.length(); i++) {
            element = s.charAt(i);
            if (element == '(' || element == '{' || element == '[') {
                stack.push(element);
            } else if (element == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    isValid=false;
                    break;
                }
            } else if (element == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }
                else {
                    isValid=false;
                    break;
                }
            } else if (element == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }
                else{
                    isValid=false;
                    break;
                }
            } else {
                isValid=false;
            }
        }
        if(stack.isEmpty() && isValid) {
            System.out.println("balanced");
        }else {
            System.out.println("invalid string");
        }
    }
}