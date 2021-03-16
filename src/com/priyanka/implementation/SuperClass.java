package com.priyanka.implementation;

public class SuperClass {
    private int a;
    private int x=0;
    public void fun1(int a) {
        try {
            int z = a / x;
        }
        catch (ArithmeticException e) {
            System.out.println("\nsuperClass invoked\n");
        }
    }

    public int getX() {
        return x;
    }
}
