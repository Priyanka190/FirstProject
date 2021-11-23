package com.priyanka.implementation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] agrs) throws FileNotFoundException,Exception {
        System.setIn(new FileInputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\KIIT\\IdeaProjects\\FirstProject\\src\\interaction\\output.txt")));
        Scanner sc = new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        for(int i=0; i<size1; i++) {
            int temp=sc.nextInt();
            list1.add(temp);
        }
        for(int j=0; j<size2; j++) {
            int temp1=sc.nextInt();
            list2.add(temp1);
        }
        int diff=size1-size2;
        if(diff<0) {
            diff=-diff;
        }
        if(diff!=0) {
            if(size1>size2) {
                for(int k=0; k<diff; k++) {
                    int element=0;
                    list2.add(element);
                }
            }
            else{
                for(int p=0; p<diff; p++) {
                    int element=0;
                    list1.add(element);
                }
            }
        }
        twoSum l  = new twoSum();
        List<Integer> result =new LinkedList<>();
        result=l.twoSum1(list1,list2);
    }

}
