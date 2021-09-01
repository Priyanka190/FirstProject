package com.priyanka.implementation;

import java.util.ArrayList;
import java.util.List;

public class SalesMarket {
    public void saleMatching(List<Integer> input, int n) {
        int count = 0;
        List<Integer> pair = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
           int temp1 = input.get(i);
            if(pair.contains(temp1)){
                count++;
                pair.remove(pair.indexOf(temp1));
            }
            else {
                pair.add(temp1);
            }

        }
        System.out.println(count);

    }
}
