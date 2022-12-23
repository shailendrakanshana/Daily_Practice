import java.util.*;

public class Coin_Change {
    public static int get_Coins(int ar[],int val){
        int n = ar.length;
        int dp[] = new int[val+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        // System.out.println(dp[2]);
        dp[0] = 0;
        for(int i = 1;i<=val;i++){
            for(int j = 0;j<n;j++){
                if(ar[j]<=i){
                    int a = dp[i-ar[j]];
                    if(a!=Integer.MAX_VALUE) dp[i] = Math.min(dp[i],a+1);
                }
            }
        }
        return dp[val];
    } 
    public static void main(String[] args) {
        int ar[] = {1,2,5};
        int val = 11;
        System.out.println(get_Coins(ar, val));
    }
}
