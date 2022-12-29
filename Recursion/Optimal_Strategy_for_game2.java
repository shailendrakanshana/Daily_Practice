public class Optimal_Strategy_for_game2 {
    //Second approach - simple just draw a simple coin selection diagram
    public static int find_score(int ar[],int i,int j){
        if(i+1==j) return Math.max(ar[i],ar[j]);

        return Math.max(ar[i] + Math.min(find_score(ar,i+2,j),find_score(ar, i+1, j-1)),
                        ar[j] + Math.min(find_score(ar,i+1,j-1),find_score(ar, i, j-2)));
    }
    public static void main(String[] args) {
        int ar[] = {20,5,4,6};
        System.out.println(find_score(ar, 0, ar.length-1));
    }
}
