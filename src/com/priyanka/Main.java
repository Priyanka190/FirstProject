package com.priyanka;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
             int a[] = new int[5];
             for(int i=0; i< a.length; i++) {
                 a[i] = sc.nextInt();
             }
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBound");
        }
        finally {
             System.out.println("finally block");
        }
        System.out.println("main code");
    }
}
