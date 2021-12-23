package com.priyanka.implementation;

import java.util.*;

public class fourSum {
   public int hrcq(int size,int[] input) {
       int index=0;
       int n=1;
       for (int i=input.length-1; i>=0; i--) {
               if (input[i] < 9) {
                   input[i] += 1;
                   index = i + 1;
                   break;
               }
               else {
                   input[i]=0;
               }
       }
       return index;
   }
}
