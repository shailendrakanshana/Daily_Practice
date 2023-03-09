import java.util.*;

public class MatchStricksTo_Square {
    //Simple BackTracking approach
    public boolean solve(int ar[],int target,int side[],int start){
        //Base case
        if(start>=ar.length){
            if(side[0]==side[1]&&side[1]==side[2]&&side[2]==side[3]) return true;
            return false;
        }
        for(int i =0;i<4;i++){
            //Exceeding the side length so ignore the possibility
            if(side[i]+ar[start]>target) continue;
            side[i] = side[i] + ar[start];
            if(solve(ar,target,side,start+1)) return true;
            side[i] = side[i] - ar[start];
        }
        return false;
    }
    public boolean makesquare(int[] ar) {
        if(ar.length<4) return false;
        int sum = 0;
        for(int x:ar) sum   = sum +x;
        if(sum%4!=0) return false;
        //Sorting in reverse order because large sticks matching will ease the process
        Arrays.sort(ar);
        reverse(ar);
        return solve(ar,sum/4,new int[4],0);
    }
    public void reverse(int ar[]){
        int a = 0;
        int b = ar.length-1;
        while(b>a){
            int temp = ar[a];
            ar[a] = ar[b];
            ar[b] = temp;
            a++;
            b--;
        }
    }
    public static void main(String[] args) {
        int ar[] = {1,1,2,2,2};
        MatchStricksTo_Square obj = new MatchStricksTo_Square();
        System.out.println(obj.makesquare(ar));
    }
}
