import java.util.Arrays;

///Memory Array reduces the time COmplexity for recursive approach;



public class Longest_Common_Subsequence {
    static int dp[][];
    public static int LSC(String s1,String s2,int m,int n){
        if(dp[m][n]!=-1) return dp[m][n];
        if(m==0 || n==0) dp[m][n] = 0;
        else{
            if(s1.charAt(m-1)==s2.charAt(n-1)) dp[m][n] = 1 + LSC(s1, s2, m-1, n-1);
            else dp[m][n] = Math.max(LSC(s1,s2,m-1,n) , LSC(s1, s2, m, n-1));
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        dp = new int[s1.length()+1][s2.length()+1];
        for(int i = 0;i<=s1.length();i++) Arrays.fill(dp[i],-1);
        System.out.println(LSC(s1, s2, s1.length(), s2.length()));
    }
}
