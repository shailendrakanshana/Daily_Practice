/*PROBLEM STATEMENT : 
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.
 * 
 */



import java.util.*;

public class Largest_Number {
    public static String largestNumber(int[] nums) {
        if(nums.length==0) return "";
        String ar[] = new String[nums.length];
        //Converting nums to String Array
        for(int i = 0;i<nums.length;i++) ar[i] = String.valueOf(nums[i]);

        //Comparator
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String str1,String str2){
                String s = str1+str2;
                String p = str2+str1;
                return p.compareTo(s);
            }
        };
        Arrays.sort(ar,comp);
        if(ar[0].charAt(0)=='0') return "0";

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<ar.length;i++){
            sb.append(ar[i]);
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
        int nums[] = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
}
