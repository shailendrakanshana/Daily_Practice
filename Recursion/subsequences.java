import java.util.Scanner;

public class subsequences {
    public static void subsequence(String str,String s,int i){
        if(i==str.length()){
            System.out.println(s);
            return;
        }
        subsequence(str, s+str.charAt(i), i+1);

        subsequence(str, s, i+1);
    }
    /*public static void rev_subsequence(String str,String s,int i){
        if(i<0){
            System.out.println(s);
            return;
        }
        rev_subsequence(str,s+str.charAt(i),i-1);
        rev_subsequence(str,s,i-1);
    }*/
    public static void subsequence(String str){
        subsequence(str,"",0);
        //rev_subsequence(str, "", str.length()-1);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        subsequence(s);
        sc.close();
    }
    
}
