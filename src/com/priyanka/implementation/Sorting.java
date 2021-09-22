package com.priyanka.implementation;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Sorting {
    public void  bubbleSort(List<Integer> a, int price) {
        int count=0;
        int size = a.size();
        for(int i=0; i<size-1; i++) {
            for(int j=i+1; j<size; j++) {
                if(a.get(i)>a.get(j)) {
                    int element = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, element);
                }
            }
        }
        int sum=0;
        int temp=0;
        int dp=price;
        for(int i=0; i<size; i++) {
            if(sum<=price) {
                System.out.println(a.get(i));
                sum+=a.get(i);
                temp=dp-a.get(i);
                dp=dp-a.get(i);
                if(dp>0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public void swap(List<Integer> a, int firstIndex, int secondIndex) {
        int element = a.get(firstIndex);
        a.set(firstIndex, a.get(secondIndex));
        a.set(secondIndex, element);


    }
//    public void selectionSort(int a[]) {
//        int min=0;
//        int temp=0;
//        int size=a.length;
//        for(int i=0; i<size-1; i++) {
//            min = i;
//          for(int j=i+1; j<size; j++) {
//              if(a[j]<a[min]) {
//                  min=j;
//              }
//          }
//            if(min!=i) {
//                swap(a,i,min);
//            }
//        }
//        for(int i=0; i<size; i++) {
//            System.out.print(a[i]+" ");
//        }
//    }

}
