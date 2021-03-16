package com.priyanka;
import com.priyanka.implementation.SubClass;
import com.priyanka.implementation.SuperClass;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        SuperClass s = new SubClass();
        s.fun1(8);
        SubClass s1 = new SubClass();
        s1.fun2(9);
        System.out.println("main code");
    }
}
