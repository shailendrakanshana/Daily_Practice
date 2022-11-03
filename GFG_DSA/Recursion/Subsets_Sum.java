import java.util.*;

public class Subsets_Sum {
    public static void find_Sum(int ar[],int start,int sum,int target,ArrayList<Integer> l){
        if(sum==target){
            System.out.println(l);
            return;
        }
        if(sum<target){
            for(int i = start;i<ar.length;i++){
                l.add(ar[i]);
                find_Sum(ar, i+1, sum+ar[i], target, l);
                l.remove(l.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {10,20,40,10,60,10};
        ArrayList<Integer> l = new ArrayList<>();
        find_Sum(ar, 0, 0, 70, l);
    }
}
