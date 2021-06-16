package com.priyanka.implementation;

import java.util.Scanner;
class MedianOfSortedArray {
    public int n,m;
    public int[] arr;
    public int[] brr;

    Scanner sc = new Scanner(System.in);
    public MedianOfSortedArray() {
        this.n = sc.nextInt();
        this.m = sc.nextInt();
        arr = new int[n];
        brr = new int[m];
    }
    public void input() {
        for(int i = 0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for(int j = 0; j<brr.length; j++) {
            brr[j] = sc.nextInt();
        }
    }
    public int[] output() {
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int j = 0; j<brr.length; j++) {
            System.out.println(brr[j]+" ");
        }
        System.out.println("");
        int[] c = mergeTwoArray();
        for(int k = 0 ;k<c.length; k++) {
            System.out.print(c[k]+" ");
        }
        return c;
    }

    public int[] mergeTwoArray() {
        int p1,p2;
        p1 = 0;
        p2 = 0;
        int[] result = new int[arr.length + brr.length];
        int p3 = 0;
        while(p1 < arr.length && p2 < brr.length) {
            int temp = 0;
            if(arr[p1] >= brr[p2]) {
                temp = brr[p2];
                p2++;
            }
            else {
                temp = arr[p1];
                p1++;
            }
            result[p3] = temp;
            p3++;
        }
        if(p1 < arr.length) {
            while(p1<arr.length) {
                result[p3] = arr[p1];
                p3++;
                p1++;
            }
        }
        if(p2 < brr.length) {
            while(p2<brr.length) {
                result[p3] = brr[p2];
                p3++;
                p2++;
            }
        }

        return result;
    }
    public int medianOfTwoArray(int[] b) {
        int size=b.length;
        if(size%2==0) {
            return (b[size/2]+b[size/2-1])/2;
        }
        else {
            return (b[size/2]);
        }
    }
}
