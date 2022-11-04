import java.util.*;

public class lec1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=75){
            System.out.println("A");
        }
        else if(a>=65){
            System.out.println("B");
        }
        else if(a>=55){
            System.out.println("C");
        }
        else if(a>=45){
            System.out.println("D");
        }
        else{
            System.out.println("FAIL");
        }
    }
}