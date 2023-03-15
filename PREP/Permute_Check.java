public class Permute_Check {
    //Constant space appraoch
    public static boolean isPer(String a,String b){
        if(a.length()!=b.length()) return false;
        int ar[] = new int[26];
        for(int i = 0;i<a.length();i++){
            ar[a.charAt(i)-'a']++;
            ar[b.charAt(i)-'a']--;
        }
        //Checking for all zero
        for(int x:ar) if(x!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPer("accd", "cdab"));
    }
}
