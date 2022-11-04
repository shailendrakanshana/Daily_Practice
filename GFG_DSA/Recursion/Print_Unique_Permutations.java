import java.util.Scanner;

public class Print_Unique_Permutations {
    public static void Unique_per(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            boolean b = false;
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(j)==c){
                    b = true;
                    break;
                }
            }
            if(!b){
                String r = s.substring(0, i)+s.substring(i+1);
                Unique_per(r, ans+c);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Unique_per(sc.next(), "");
    }
    
}
