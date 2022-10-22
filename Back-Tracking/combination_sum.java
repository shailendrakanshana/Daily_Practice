import java.util.*;

public class combination_sum {
    public static void printper(int ar[],int s,int start,List<Integer> l,int target,List<List<Integer>> r){
        if(s==target){
            r.add(new ArrayList<>(l));
            return;
        }
        if(s<target){
            for(int i = start;i<ar.length;i++){
                l.add(ar[i]);
                printper(ar, s+ar[i],i, l,target,r);//we will replace start with i for finding combinations
                l.remove(l.size()-1);
            }
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        printper(candidates,0,0,l,target,r);
        return r;

    }
    public static void main(String[] args) {
        int ar[] = {2,3,5,7};
        int target = 10;
        System.out.println(combinationSum(ar, target));
    }
    
}
