//Collection of all substrings of a string

import java.util.*;

public class All_substring {
    //For String
    /*public static void Partitioning(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int cut = 1;cut<=s.length();cut++){
            String p = s.substring(0, cut);
            //Partitioning(s.substring(cut), ans+p+"|");
            //for palindrome substring
            if(isPalindrome(p)){
                Partitioning(s.substring(cut), ans+p+"|");
            }
        }
    }*/
    public static void Partitioning(String s,List<String> l,List<List<String>> r){
        if(s.length()==0){
            r.add(new ArrayList<>(l));
            return;
        }
        for(int cut = 1;cut<=s.length();cut++){
            String p = s.substring(0, cut);
            //Partitioning(s.substring(cut), ans+p+"|");
            //for palindrome substring
            if(isPalindrome(p)){
                l.add(p);
                Partitioning(s.substring(cut), l,r);
                l.remove(l.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int a = 0;
        int b = s.length()-1;
        while(b>a){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            b--;
            a++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        //Partitioning(s, "");
        List<String> l = new ArrayList<>();
        List<List<String>> r = new ArrayList<>();
        Partitioning(s, l,r);
    }
}
