import java.util.Scanner;

public class decitob {
    public static int dtob(int n,int r){
        int s = 0;
        int i = 0;
        while(n>0){
            s = s + (n%r)*(int)Math.pow(10,i);
            n = n/r;
            i++;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(dtob(a,b));
    }
}
