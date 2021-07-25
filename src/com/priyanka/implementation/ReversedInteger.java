package com.priyanka.implementation;

import java.util.Scanner;
class ReversedInteger {
    Scanner sc = new Scanner(System.in);
    int reverseInput(long input) {
        long reversed = reverse(input);
        if(reversed>Integer.MIN_VALUE && reversed<Integer.MAX_VALUE) {
            return (int) reversed;
        }
        else {
            return 0;
        }

    }
    long reverse(long number) {
        long reverse=0;
        while(number !=0)
        {
            long remainder = number % 10;
            reverse = reverse * 10 + remainder;
                number = number / 10;
        }
        return reverse;
    }
}
