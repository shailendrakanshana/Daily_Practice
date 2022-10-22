//given an array {2,3,5,7,11} find all permutations for sum = 10

public class permutten {
    public static void printper(int ar[],int s,String ans){
        if(s==10){
            System.out.println(ans);
            return;
        }
        if(s<10){
            for(int i = 0;i<ar.length;i++){
                printper(ar, s+ar[i], ans+ar[i]);
            }
        }
    }
    public static void main(String[] args) {
        int ar[] = {2,3,5,7,11};
        printper(ar, 0, "");
    }

    
}
