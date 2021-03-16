package com.priyanka.implementation;

public class SubClass<k> extends SuperClass {
    private int y;
    public void fun2(int y) {
        try {
            int k = y/getX();
        }
        catch (ArithmeticException e) {
            System.out.println("\nsubClass exception invoked\n");
        }
    }
}
