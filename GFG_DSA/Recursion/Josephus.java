import java.util.Scanner;

public class Josephus {
    public static int jos(int n,int k){
        if(n==1){
            return 0;
        }
        return (jos(n-1, k)+k)%n;
    }
    public static int suvivor(int n,int k){
        return jos(n, k)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(suvivor(sc.nextInt(), sc.nextInt()));
    }
}
