import java.util.Scanner;

public class Nth_Fibonacci {
    public static int fab(int n){
        if(n==0 || n==1) return n;

        return fab(n-1)+fab(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fab(sc.nextInt()));
    }
    
}
