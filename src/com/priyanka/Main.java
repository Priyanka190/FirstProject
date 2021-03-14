package com.priyanka;

import com.priyanka.implementation.Substaff;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double basicSalary;
        Scanner sc = new Scanner(System.in);
        basicSalary = sc.nextDouble();
        Substaff s = new Substaff(basicSalary);
        s.earning();
        s.deduction();
        s.bonus();
        System.out.println(s);
    }
}
