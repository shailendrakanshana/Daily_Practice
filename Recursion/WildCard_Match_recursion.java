public class WildCard_Match_recursion{
    public static boolean findMatch(String s,String p,int i,int j){
        //base conditions
        if(i==s.length() && j==p.length()) return true;
        if(i==s.length() && j!=p.length()){
            for(int idx = j;idx<p.length();idx++){
                if(p.charAt(idx)!='*') return false;
            }
            return true;
        }
        if(j==p.length() && i!=s.length()) return false;
        
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
        return ans;
    }
    public static boolean isMatch(String s, String p) {
        return findMatch(s,p,0,0);
    }
    public static void main(String[] args) {
        System.out.println(isMatch("aedca", "a*d?a"));
    }
}