public class sliding_win_subarr {
    public static int subarr_sum(int ar[],int n,int k){
        int s = 0;
        for(int i = 0;i<k;i++){
            s = s + ar[i];
        }
        int a = 1;
        int b = k;
        int m = s;
        while(b<n){
            s = s - ar[a-1];
            s = s + ar[b];
            if(s>m){
                m = s;
            }
            a++;
            b++;
        }
        return m;

    }
    public static void main(String[] args) {
        int ar[] = {2,3,4,1,5,6,7,1,8,9,11};
        System.out.println(subarr_sum(ar, ar.length, 3));
        
    }
    
}
