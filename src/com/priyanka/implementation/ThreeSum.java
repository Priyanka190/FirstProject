package com.priyanka.implementation;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {

    public int threeSum(int[] input,int target) {
        int sum,i,j,k;
        int size = input.length;
        int minDistance=Integer.MAX_VALUE;
        int resultedSum=0;
        for(i=0; i<=size-3; i++) {
           for(j=i+1; j<=size-2; j++) {
               for(k=j+1;k<=size-1;k++) {
                   sum=input[i]+input[j]+input[k];
                   int distanceFromTarget = sum-target;
                   if(distanceFromTarget<0) {
                       distanceFromTarget=-distanceFromTarget;
                   }
                   if(distanceFromTarget<minDistance) {
                       resultedSum=sum;
                       minDistance=distanceFromTarget;
                   }
               }
           }
        }
      return resultedSum;
    }

}
