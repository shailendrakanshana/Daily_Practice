//With DP array for storing Memory value;


public class Longest_Increasing_Subsequence {
    public static int LIS(int ar[]){
        int n = ar.length;
        int dp[] = new int[n];
        dp[0] = 1; //Because LIS for 1st element is 1 
        for(int i =0;i<n;i++){
            dp[i] = 1;
            for(int j = 0;j<i;j++){
                if(ar[j]<ar[i]) dp[i]  = Math.max(dp[i],dp[j]+1);
            }
        }
        int max = 0;
        for(int i = 0;i<n;i++){
            max = Math.max(max,dp[i]);//Finding MAX LIS value
        }
        return max;
    }
    public static void main(String[] args) {
        int ar[] = {10,9,2,5,3,7,101,18};
        System.out.println(LIS(ar));
    }
}
