import java.util.*;

public class Maximum_Absolute_Diff {
    public static int maxArr(ArrayList<Integer> A) {
        //For variables appraoch
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0;i<A.size();i++){
            // For first min max
            max1 = Math.max(max1,A.get(i)+i);
            min1 = Math.min(min1,A.get(i)+i);
            // For second min max
            max2 = Math.max(max2,A.get(i)-i);
            min2 = Math.min(min2,A.get(i)-i);
        }
        return Math.max((max1-min1),(max2-min2));
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int ar[] = {1, 3, -1};
        for(int x:ar) l.add(x);
        System.out.println(maxArr(l));
    }
}
