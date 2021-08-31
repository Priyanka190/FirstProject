package com.priyanka.implementation;

public class WaterContainer {
    public int maxContain(int[] height) {
        int maxArea=0;
        int size=height.length;
        int[] a = new int[size];
        int[] b = new int[size];
        for(int i=1; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                a[0]=i;
                a[1]=height[i-1];
                b[0]=j;
                b[1]=height[j-1];
                int tempHeight = 0;
                int tempWidth = 0;
                if(a[1]<b[1]) {
                    tempHeight = a[1];
                }
                else if(b[1]<a[1]) {
                    tempHeight = b[1];
                }
                else {
                    tempHeight = a[1];
                }
                tempWidth = j-i;
                int tempArea=0;
                tempArea=tempHeight*tempWidth;
                System.out.println(tempArea);
                if(tempArea>maxArea) {
                    maxArea = tempArea;
                }

            }
        }
        return maxArea;
    }
}
