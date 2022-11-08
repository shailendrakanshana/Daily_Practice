import java.util.*;
public class Murthal_Paratha {
	public static int mn_time(int[] cook, int p) {
		int hi = Integer.MAX_VALUE;
		int lo = 0;
		int ans = Integer.MAX_VALUE;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (possibility(cook, mid, p)) {
				ans = Math.min(mid,ans);
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}
	public static boolean possibility(int[] cook, int mid, int p) {
		for(int i=0;i<cook.length;i++){
			int total_time=0;
			int cur_time = 1;
			while(total_time+cur_time*cook[i]<=mid && p>0){
				total_time+=cur_time*cook[i];
				p--;
				cur_time++;
			}
			if(p==0) return true;
		}
		return p==0;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) ar[i]=sc.nextInt();
		Arrays.sort(ar);
		System.out.println(mn_time(ar, p));
    }
}
