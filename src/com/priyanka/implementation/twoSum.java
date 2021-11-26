package com.priyanka.implementation;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class twoSum {

   public float atm(int amount,float balance) {
       float totalAmount=0;
       if(amount%5==0 && amount<=balance) {
           totalAmount=balance-amount;
           totalAmount= (float) (totalAmount-0.5);
       }
       else {
           return balance;
       }
       return totalAmount;
   }

}
