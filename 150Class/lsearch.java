import java.util.Scanner;

public class lsearch {
    public static void reverse(int ar[]){
        int f = 0;
        int l = ar.length-1;
        while(l>f){
            int temp = ar[f];
            ar[f] = ar[l];
            ar[l] = temp;
            f++;
            l--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {2,3,-1,4,7,11,9};
        reverse(ar);
        for(int i =0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
    
}
