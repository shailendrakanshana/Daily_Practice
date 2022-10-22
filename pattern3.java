import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int r = n;
        while(i<=(2*n-1)){
            int j = 0;
            while(j<r){
                System.out.print("  ");
                j++;
            }
            int k = 0;
            while(k<i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i +=2;
            r--;
        }
    }
    
}
