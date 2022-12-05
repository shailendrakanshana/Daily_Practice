public class WildCard_Match_DP {
    Boolean dp[][];
    public boolean findMatch(String s,String p,int i,int j){
        //base conditions
        if(i==s.length() && j==p.length()) return true;
        if(i==s.length() && j!=p.length()){
            for(int idx = j;idx<p.length();idx++){
                if(p.charAt(idx)!='*') return false;
            }
            return true;
        }
        if(j==p.length() && i!=s.length()) return false;
        //DP array running check
        if(dp[i][j]!=null) return dp[i][j];
        
        //For storing the result
        boolean ans = false;
        // ? case
        if(p.charAt(j)=='?'){
            if(findMatch(s,p,i+1,j+1)) ans= true;
        }
        //* case
        else if(p.charAt(j)=='*'){
            if(findMatch(s,p,i,j+1)) ans = true;
            if(findMatch(s,p,i+1,j+1)) ans = true;
            if(findMatch(s,p,i+1,j)) ans = true;
        }
        else{
            //For both char
            if(s.charAt(i)==p.charAt(j) && findMatch(s,p,i+1,j+1)) ans = true;
        }
        dp[i][j] = ans;
        return ans;
    }
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()][p.length()];
        return findMatch(s,p,0,0);
    }
    public static void main(String[] args) {
        WildCard_Match_DP obj = new WildCard_Match_DP();
        System.out.println(obj.isMatch("aedca", "a*d?a"));
    }
}
