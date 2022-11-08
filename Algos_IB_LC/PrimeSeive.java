import java.util.Scanner;

public class PrimeSeive {
    public static void Prime_Sieve(int n){
        boolean b[] = new boolean[n+1];
        b[0] = true;
        b[1] = true;
        for(int i  = 2;i<b.length;i++){
            if(b[i]==false){
                for(int j = 2;i*j<=n;j++){
                    b[i*j] = true;
                }
            }
        }
        for(int i = 0;i<=n;i++){
            if(b[i]==false){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime_Sieve(sc.nextInt());
    }
    
}
