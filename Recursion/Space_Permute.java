import java.util.*;

public class Space_Permute {
    public static void Print_Per(String s,int i,String ans,List<String> r){
        if(i==s.length()){
            r.add(ans);
            return;
        }
        char c = s.charAt(i);
        if(c=='_'){
            Print_Per(s, i+1, ans+"+", r);
            Print_Per(s, i+1, ans+"-", r);
            Print_Per(s, i+1, ans+".", r);
            Print_Per(s, i+1, ans+"/", r);
        }
        else{
            Print_Per(s, i+1, ans+c, r);
        }
    }
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        Print_Per("ab_bcd_", 0, "", l);
        System.out.println(l);
    }
}
