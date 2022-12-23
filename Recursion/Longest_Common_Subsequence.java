public class Longest_Common_Subsequence {
    public static int LSC(String s1,String s2,int m,int n){
        if(m==0 || n==0) return 0;
        if(s1.charAt(m-1)==s2.charAt(n-1)) return 1 + LSC(s1, s2, m-1, n-1);
        else return Math.max(LSC(s1,s2,m-1,n) , LSC(s1, s2, m, n-1));
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(LSC(s1, s2, s1.length(), s2.length()));
    }
}
