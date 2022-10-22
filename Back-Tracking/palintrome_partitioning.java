import java.util.*;

public class palintrome_partitioning {
    public static void subsequences(String s,String ans,int i,List<String> r){
        if(i==s.length()){
            r.add(ans);
            return;
        }
        subsequences(s, ans+s.charAt(i), i+1, r);
        
        subsequences(s, ans, i+1, r);
    }
    public static boolean isPalindrome(String s){
        int a = 0;
        int b = s.length()-1;
        while(b>a){
            if(s.charAt(b)!=s.charAt(a)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> l = new ArrayList<>();
        subsequences(s, "", 0, l);
        System.out.println(l);
        List<String> r = new ArrayList<>();
        for(int i = 0;i<l.size();i++){
            if(isPalindrome(l.get(i))){
                r.add(l.get(i));
            }
        }
        System.out.println(r);
    }
    
}
