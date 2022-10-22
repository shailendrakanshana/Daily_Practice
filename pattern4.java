import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int l = 1;
        int h = n;
        while(i<n){
            int j = 1;
            while(j<=n){
                if(j==l || j==h){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
            }
            l++;
            h--;
            i++;
            System.out.println();
        }
    }
    
}
