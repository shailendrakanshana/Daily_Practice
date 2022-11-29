import java.util.Scanner;

public class Generate_Paranthesis {
    public static void generate(int n,String ans,int op,int cl){
        if(op==n && cl==n){
            System.out.println(ans);
            return;
        }
        if(cl<op) generate(n, ans+")", op, cl+1);
        if(op<n) generate(n, ans+"(", op+1, cl);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generate(sc.nextInt(), "", 0, 0);
    }
    
}
