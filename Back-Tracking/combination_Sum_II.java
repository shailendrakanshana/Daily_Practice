import java.util.*;

public class combination_Sum_II {
    public static void find_Sum(int ar[],int start,int sum,int target,List<Integer> l,List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(sum<target){
            for(int i = start;i<ar.length;i++){
                if(i>start && ar[i-1]==ar[i]) continue;
                l.add(ar[i]);
                find_Sum(ar, i+1, sum+ar[i], target, l,ans);
                l.remove(l.size()-1);
            }
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> ans = new  ArrayList<>();
        Arrays.sort(candidates);
        find_Sum(candidates,0,0,target,l,ans);
        return ans;
    }

    public static void main(String[] args) {
        int ar[] = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(ar, target));
    }
}
