public class Unique_Path2 {
    public static int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0]==1) return 0;
        int n = grid.length;
        int m = grid[0].length;
        //Dp ARRAY
        int dp[][] = new int[n][m];
        //All 1's in first row
        //Any path is block path will exist on remaining path so breaking the loop
        for(int i  =0;i<m;i++){
            if(grid[0][i]==1) break;
            dp[0][i] = 1;
        }
        //All 1's in first column
        for(int i = 0;i<n;i++){
            if(grid[i][0]==1) break;
            dp[i][0] = 1;
        }
        //Final showdown
        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(grid[i][j]==1) continue;
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n-1][m-1];

    }
    public static void main(String[] args) {
        int grid[][] = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(grid));

    }
    
}
