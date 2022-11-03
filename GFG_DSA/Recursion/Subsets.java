import java.util.Scanner;

public class Subsets {
    public static void print_Subsets(String s,String cur,int i){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }

        print_Subsets(s, cur, i+1);
        print_Subsets(s, cur+s.charAt(i), i+1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print_Subsets(sc.next(), "", 0);
    }
    
}
