import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void Print_Movements(int n,char src,char helper,char dest){
        if(n==1){
            System.out.println("Move "+n+ " From "+src+" to "+dest);
            return;
        }
        Print_Movements(n-1, src, dest, helper);
        System.out.println("Move "+n+ " From "+src+" to "+dest);
        Print_Movements(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Print_Movements(sc.nextInt(), 'S', 'H', 'D');
    }
}
