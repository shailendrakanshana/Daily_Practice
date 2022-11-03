import java.util.Scanner;

public class Digit_Sum {
    public static int SumOfDigit(int n){
        if(n<=9) return n;//will return the first digit like 1 for 1234 

        return SumOfDigit(n/10) + n%10;// 4 + 3 + 2 + 1 = 10 will Run like this
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOfDigit(n));
    }
}
