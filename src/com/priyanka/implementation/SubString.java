package com.priyanka.implementation;

import java.util.Scanner;
class SubString{
    Scanner sc = new Scanner(System.in);
    public void longestPalindrome(String input) {
        int lengthOfInput = input.length();
        int startIndex=0;
        int endIndex=0;
        int longestLength=0;
        /*
        iterate on each char in string.
        for each character
            search for same character
            if found
                find reverse from i to j
                if palindrome
                    calculate temporary length
                    tempStartIndex=i
                    tempEndIndex=j
                    if tempLength greater than longestLength
                        store tempLength in longestLength
                        store startIndex and endIndex
                not palindrome
                    to be done
                    move to the next same character
                    if tempLength greater than longestLength
                        store tempLength in longestLength
                        store startIndex and endIndex
        */
        for(int i=0; i<lengthOfInput; i++) {
            for (int j = i + 1; j < lengthOfInput; j++) {
                if (input.charAt(i) == input.charAt(j)) {
//                    System.out.println(input.charAt(i)+" i "+i+" j "+j);
                    String r = input.substring(i,j+1);
                    String temprev = reverse(r);
//                    System.out.println("line 35 "+input.substring(i,j+1));
//                    System.out.println("line 36 "+temprev);
                    boolean result = r.equals(temprev);
//                    System.out.println("line 38 "+result);
                    int tempStartIndex = i;
                    int tempEndIndex = j;
                    if (result == true) {
                        int tempLength = tempEndIndex - tempStartIndex + 1;
                        if (tempLength > longestLength) {
                            startIndex = i;
                            endIndex = j;
                            longestLength = tempLength;
//                          System.out.println("line 47 "+longestLength +" tempStartIndex "+tempStartIndex+" tempEndIndex "+tempEndIndex);
                        }
                    }
                }
            }
        }
        System.out.println(input.substring(startIndex,endIndex+1));
    }
    static String reverse(String str)
    {
        //abcba
        int lastIndex=str.length()-1;
        String reverse = "";
        for(int i=lastIndex; i>=0; i--) {
            reverse +=str.charAt(i);
        }

        return reverse;
    }

}
