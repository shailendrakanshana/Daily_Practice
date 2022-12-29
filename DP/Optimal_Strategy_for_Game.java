// ⭐⭐⭐⭐⭐IMPORTANT


public class Optimal_Strategy_for_Game {
    //Converting 2nd recursive solution to DP matrix
    public static int find_Score(int ar[]){
        int n = ar.length;
        int dp[][] = new int[n][n];

        //If confusion watch video of DP - GFG
        for(int i = 0;i<n-1;i++) dp[i][i+1] = Math.max(ar[i],ar[i+1]);

        //Filling second Diagonal for finding final solution
        for(int gap = 3;gap<n;gap = gap+2){
            for(int i = 0;i+gap<n;i++){
                int j = i+gap;

                dp[i][j] = Math.max(ar[i] + Math.min(dp[i+1][j-1],dp[i+2][j]),
                                    ar[j] + Math.min(dp[i][j-2],dp[i+1][j-1]));
            }
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        int ar[] = {20,5,4,6};

        System.out.println(find_Score(ar));
    }
}
