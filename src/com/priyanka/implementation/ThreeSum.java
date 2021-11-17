package com.priyanka.implementation;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {

    public ArrayList threeSum(int[] input) {
        int sum,i,j,k;
        if(input.length<3) return new ArrayList();
        int size = input.length;
        Arrays.sort(input);
        List<List<Integer>> array = new ArrayList<>(size);
        Set<List<Integer>> set =new HashSet();
        for(i=0; i<size-2; i++) {
            j=i+1;
            k=size-1;
            while(j<k) {
                sum=input[i]+input[j]+input[k];
                if(sum==0) {
                    set.add(Arrays.asList(input[i],input[j++],input[k--]));
                }
                else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList(set);
    }

}
