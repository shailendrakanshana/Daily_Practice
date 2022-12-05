import java.util.Scanner;

public class tofhanoi {
    public static void towerOfhanoi(int n,String src,String helper,String Dest){
        if(n==1){
            System.out.println("Transfer from "+src+" to "+Dest);
            return;
        }
        towerOfhanoi(n-1, src, Dest, helper);
        System.out.println("Transfer from "+src+" to "+Dest);
        towerOfhanoi(n-1, helper, src, Dest);
    }
    public static void towerOfhanoi(int n){
        towerOfhanoi(n,"S","H","D");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfhanoi(n);
        sc.close();
    }
    
}
