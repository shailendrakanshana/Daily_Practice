public class Unique_String{
    //No space Appraoch
    public static boolean check(String s){
        //Bit manpulation appraoch
        int checker = 0;
        for(char c:s.toCharArray()){
            int a = c-'a';
            //left shift and check 
            if((checker&(1 << a))>0) return false;
            checker = checker|(1<<a);
        }
        return true;
    }
    //Constant space appraoch
    public static boolean uniqueCheck(String s){
        boolean b[] = new boolean[26];
        for(char c:s.toCharArray()){
            if(b[c-'a']) return false;
            b[c-'a'] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(check(s));
        System.out.println(uniqueCheck(s));
    }
}