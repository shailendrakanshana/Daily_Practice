import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<2*i){
                System.out.print("  ");
                j++;
            }
            int k = 0;
            while(k<n-i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    
}
