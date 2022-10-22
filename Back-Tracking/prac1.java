//print all permutations of an array in String Format

public class prac1 {
    static int r = 0;
    public static void printper(int[] ar,boolean[] b,int j,String ans){
        if(j==ar.length){
            System.out.println(ans);
            r++;
            return;
        }
        for(int i = 0;i<ar.length;i++){
            if(b[i]==false){
                b[i] = true;
                printper(ar, b, j+1, ans+ar[i]);
                b[i] = false;
            }
        }

    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        boolean b[] = new boolean[5];
        printper(ar, b, 0, "");
        System.out.println(r);
    }
    
}
