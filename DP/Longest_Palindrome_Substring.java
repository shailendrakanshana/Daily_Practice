public class Longest_Palindrome_Substring {
    public static int findPalLen(String s,int left,int right){
        while(left>=0 && right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static String LPS(String s){
        if(s.length()==0) return "";
        int start = 0;
        int end = 0;
        for(int i= 0;i<s.length();i++){
            int oddLen = findPalLen(s, i, i);
            int eveLen = findPalLen(s, i, i+1);
            int len = Math.max(oddLen, eveLen);
            if(len>end-start){
                start = i - (len-1)/2;
                end = i + (len/2);
            }
        }
        return s.substring(start, end+1);
    }
    public static void main(String[] args) {
        System.out.println(LPS("babad"));
    }
}
