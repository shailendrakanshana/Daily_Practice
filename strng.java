import java.util.Scanner;

public class strng {
    public static int cmpTo(String a,String b){
        int r = 0;
        int n = Math.min(a.length(),b.length());
        for(int i = 0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                r = a.charAt(i) - b.charAt(i);
                break;
            }
        }
        if(a.length()!=b.length()){
            return a.length() - b.length();
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a  =sc.next();
        String b = sc.next();
        System.out.println(cmpTo(a, b));
    }

    
}
