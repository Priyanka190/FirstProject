package com.priyanka.implementation;

public class palindromic {
    public void palindrom(int n) {
        int rev = 0, remainder;
        String s = Integer.toString(n);
        String r="";
        for(int i=s.length()-1; i>=0; i--) {
            r+=s.charAt(i);
        }
        System.out.println(r);
        if(r.equals(s)) {
            System.out.println("palindrom");
        }
        else {
            System.out.println("not palindrom");
        }
    }
}
