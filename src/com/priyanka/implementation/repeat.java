package com.priyanka.implementation;

public class repeat {
    public long repetion(String s,long n) {
        int count=0;
        char someChar = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == someChar) {
                count++;
            }
        }
        int size = s.length();
        long rep = n/size;
        long rem = count*rep;
        long sep = n-rep*size;
        if(sep==0) {
            return rem;
        }
        int count2=0;
        for (int i = 0; i < sep; i++) {
            if (s.charAt(i) == someChar) {
                count2++;
            }
        }
        long final1 = rem+count2;
        return final1;

    }
}
