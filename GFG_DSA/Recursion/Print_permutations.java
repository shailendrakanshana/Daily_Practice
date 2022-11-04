import java.util.Scanner;

public class Print_permutations {
    public static void Print_Per(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<s.length();i++){
            String r = s.substring(0, i)+s.substring(i+1);
            Print_Per(r, ans+s.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Print_Per(sc.next(), "");
    }
}
