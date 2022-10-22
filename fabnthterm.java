import java.util.Scanner;

public class fabnthterm {
    public static int nthfab(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2;i<n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthfab(n));
    }
}
