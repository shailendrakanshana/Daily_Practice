import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder s = new StringBuilder();
        s.append(n);
        int ar[] = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            ar[i] = Integer.parseInt(""+s.toString().charAt(i));
        }
        for(int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    
}
