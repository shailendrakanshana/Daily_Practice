import java.util.Scanner;

public class strdp {
    public static boolean dupcheck(String s){
        boolean ar[] = new boolean[256];
        for(int i = 0;i<s.length();i++){
            int c = s.charAt(i);
            if(ar[c]==true){
                return false;
            }
            ar[c] = true;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dupcheck(s));
        
    }
    
}
