import java.util.*;

public class Activity_Selection{
    public static List<List<Integer>> find_Activity(int ar[][]){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(ar[0][0]);
        l.add(ar[0][1]);
        ans.add(l);
        for(int i = 1;i<ar.length;i++){
            if(ar[i][0]<ans.get(ans.size()-1).get(1)) continue;
            else{
                List<Integer> r = new ArrayList<>();
                r.add(ar[i][0]);
                r.add(ar[i][1]);
                ans.add(r);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int ar[][] = {{2,3},{5,8},{1,4},{6,10}};
        int ar[][] = {{1,3},{2,4},{3,8},{10,11}};
        Arrays.sort(ar ,(a,b) ->Integer.compare(a[1], b[1])); 
        // for(int i = 0;i<4;i++){
        //     System.out.println(ar[i][0]+" "+ar[i][1]);
        // }
        List<List<Integer>> ans = find_Activity(ar);
        System.out.println(ans);
    }
}