public class Unique_Path {
    public static int uniquePaths(int n,int m) {
        //Dp ARRAY
        int dp[][] = new int[n][m];
        //All 1's in first row
        for(int i  =0;i<m;i++){
            dp[0][i] = 1;
        }
        //All 1's in first column
        for(int i = 0;i<n;i++){
            dp[i][0] = 1;
        }
        //Final showdown
        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n-1][m-1];

    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 4));
    }
}
