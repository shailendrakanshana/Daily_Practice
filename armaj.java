public class armaj {
    public static int majele(int ar[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<ar.length;i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        int br[] = new int[max+1];
        for(int i = 0;i<ar.length;i++){
            br[ar[i]]++;
        }
        int m = 0;
        int idx = 0;
        for(int i = 0;i<max+1;i++){
            if(br[i]>m){
                m = br[i];
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int ar[] = {2,2,1,1,1,2,2,34,2,1,1,1,1,1,5,5,5,5,5,2,1};
        System.out.println(majele(ar));
        
    }
    
}
