import java.util.Scanner;

public class Rope_Cutting {
    public static int Find_Peaces(int n,int a,int b,int c,int count){
        if(n==0) return count;
        if(n<0) return -1;

        return Math.max(Math.max(Find_Peaces(n-a, a, b, c, count+1),Find_Peaces(n-b, a, b, c, count+1)),Find_Peaces(n-c, a, b, c, count+1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum pieces = "+Find_Peaces(n, a, b, c, 0));

    }
    
}
