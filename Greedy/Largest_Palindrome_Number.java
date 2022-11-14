/*PROBLEM STATEMENT: 2384
You are given a string num consisting of digits only.

Return the largest palindromic integer (in the form of a string) that can be formed using digits taken from num. 
It should not contain leading zeroes.

Notes:

You do not need to use all the digits of num, but you must use at least one digit.
The digits can be reordered.
 * 
 * 
 * 
 */

import java.util.*;

public class Largest_Palindrome_Number {
    public static String largestPalindromic(String num) {
        int freq[] =  new int[10];
        for(int i = 0;i<num.length();i++){
            freq[num.charAt(i)-'0']++;
        }
        ArrayList<Integer> l = new ArrayList<>();
        int m = -1;
        for(int i = 9;i>=0;i--){
            if(freq[i]%2!=0){
                m = Math.max(m,i);
            }
            int p = freq[i]/2;
            while(p-->0) l.add(i);
        }
        //Removing front zeros
        if(l.size()>0){
            while(l.get(0)==0){
                l.remove(0);
                if(l.size()==0) break;
            }
        }
        //First I will append list 0 to last and then check m then last to 0 in sb.
        //System.out.println(l);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<l.size();i++){
            sb.append(l.get(i));
        }
        if(m!=-1){
            sb.append(m);
        }
        for(int i = l.size()-1;i>=0;i--){
            sb.append(l.get(i));
        }
        if(sb.toString().length()==0) return "0";
        return sb.toString();
    }

    public static void main(String[] args) {
        String num  = "444947137";
        System.out.println(largestPalindromic(num));
    }
}
