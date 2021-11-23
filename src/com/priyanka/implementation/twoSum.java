package com.priyanka.implementation;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class twoSum {

    public List<Integer> twoSum1(List list1,List list2) {
        List<Integer> finslList = new LinkedList<>();
        int sum=0,qouteint=0,rem=0;
        int temp1=0,temp2 = 0;
        for(int i=0; i<list1.size(); i++) {
            temp1= (int) list1.get(i);
            temp2= (int) list2.get(i);
            sum=temp1+temp2+qouteint;
            if(sum<=9) {
                qouteint=0;
                finslList.add(sum);
            }
            else {
                qouteint=0;
                rem=sum%10;
                qouteint=sum/10;
                finslList.add(rem);
            }
        }
        if(qouteint!=0) {
            finslList.add(qouteint);
        }
        System.out.println(finslList);
        return finslList;
    }


}
