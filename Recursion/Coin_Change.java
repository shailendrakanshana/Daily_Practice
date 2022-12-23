public class Coin_Change {
    public static int find_Min_COins(int ar[],int val){
        if(val==0) return 0;
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<ar.length;i++){
            if(ar[i]<=val){
                int a = find_Min_COins(ar, val-ar[i]);
                if(a!=Integer.MAX_VALUE) res = Math.min(res,a+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int ar[] = {1,2,5};
        int val = 100;
        System.out.println(find_Min_COins(ar, val));
    }
}
