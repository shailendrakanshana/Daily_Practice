import java.util.*;
public class inverseNumberHB {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int i = 1;
		while(n>0){
			int r = n%10;
			ans = ans + i*(int)Math.pow(10,r-1);
			n = n/10;
			i++;
		}
		System.out.println(ans);
    }
}