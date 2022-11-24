import java.util.*;

public class Max_Points_On_Line {
    public static int maxPoints(int[][] points) {
        int n = points.length;
        if(n<=2) return n;
        int max = 0;
        for(int i = 0;i<n;i++){
            HashMap<Double,Integer> map = new HashMap<>();
            for(int j = 0;j<n;j++){
                if(i==j) continue;
                double k = (double)(points[j][1]-points[i][1])/(double)(points[j][0]-points[i][0]);
                if(map.containsKey(k)) map.put(k,map.get(k)+1);
                else map.put(k,2);
                max = Math.max(max,map.get(k));
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int points[][] = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(maxPoints(points));
    }
}
