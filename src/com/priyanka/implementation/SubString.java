package com.priyanka.implementation;

import java.util.Scanner;
class SubString{
    Scanner sc = new Scanner(System.in);
    public void fun1(String str) {
        char[] b = new char[8];
        int lastIndexOfB = -1;
        int currentIndexOfInputStr = 0;
        int inputStringLen= str.length();
        int currentSubstringLen = 0;
        int largestSubstringLen=0;
        while(currentIndexOfInputStr<inputStringLen) {
            for (int i = currentIndexOfInputStr; i < inputStringLen; i++) {
                char curr = str.charAt(i);
                boolean exist = false;
                for (int j = 0; j <= lastIndexOfB; j++) {
                    if (b[j] == curr) {
                        exist = true;
                        break;
                    }
                }
                if (exist) {
                    lastIndexOfB=-1;
                    if(currentSubstringLen>largestSubstringLen) {
                        largestSubstringLen = currentSubstringLen;
                    }
                    currentSubstringLen = 0;
                    currentIndexOfInputStr++;
                    break;
                } else {
                   b[++lastIndexOfB]=curr;
                   currentSubstringLen++;
                }
            }
        }
        System.out.println(largestSubstringLen);
    }
}
