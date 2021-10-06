package com.priyanka.implementation;

public class LongestCommonPrefix {
    public String prefix(String[] strs) {
        if(strs.length ==0){
            return "";

        }

        String res = "";

        String prefix =strs[0];

        for(int i =0;i<strs.length;i++){
            int j =0;
            while(j<prefix.length() && j <strs[i].length()  && prefix.charAt(j) == strs[i].charAt(j)){
                j++;
                System.out.println(j);
            }
            prefix = prefix.substring(0, j);
            if(prefix.equals("")){
                return "";
            }
        }
        return prefix;
    }

}
