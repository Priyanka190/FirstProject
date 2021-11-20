package com.priyanka.implementation;

import java.lang.reflect.Array;
import java.util.*;

public class twoSum {

    public int[] twoSum(int[] input,int target) {
        int sum,i,j;
        List<Integer> list=new LinkedList<Integer>();
        int size = input.length;
        int resultedSum=0;
        for(i=0; i<=size-2; i++) {
            j=i+1;
            while(j<=size-1) {
                sum=input[i]+input[j];
                if(sum==target) {
                    resultedSum=sum;
                    list.add(i);
                    list.add(j);
                }
                j++;
            }
        }
        int[] arr = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }
        return arr;
    }

}
