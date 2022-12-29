public class Optimal_Strategy_for_game {
    public static int find_score(int ar[],int i,int j,int sum){
        if(j==i+1) return Math.max(ar[i],ar[j]);

        return Math.max(sum-find_score(ar, i+1, j, sum-ar[i]),sum-find_score(ar, i, j-1, sum-ar[j]));

    }
    public static void main(String[] args) {
        int ar[] = {20,5,4,6};
        int sum  = 0;
        for(int i = 0;i<ar.length;i++) sum = sum + ar[i];
        
        System.out.println(find_score(ar, 0, ar.length-1, sum));
    }
}
