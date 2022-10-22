import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 0;
            while(j<n-i){
                System.out.print("  ");
                j++;
            }
            int k = 0;
            while(k<i){
                System.out.print("* ");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
