import java.util.Scanner;

public class Palindrome_Check{
    public static boolean pal_Check(String s,int left,int right){
        if(right<left) return true;

        if(s.charAt(left)!=s.charAt(right)) return false;

        return pal_Check(s,left+1,right-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(pal_Check(s, 0, s.length()-1));
    }
}