// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

// A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


import java.util.*;

public class Letter_Combs_OfPhoneNum {
    public static void getComs(String digits,int start,StringBuilder sb,List<String> res,String digString[]){
        if(start==digits.length()){
            res.add(sb.toString());
            return;
        }
        String s = digString[digits.charAt(start)-'2'];
        for(int i = 0;i<s.length();i++){
            sb.append(s.charAt(i));
            getComs(digits,start+1,sb,res,digString);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static List<String> letterCombinations(String digits) {
        String digString[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;
        getComs(digits,0,new StringBuilder(),res,digString);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
