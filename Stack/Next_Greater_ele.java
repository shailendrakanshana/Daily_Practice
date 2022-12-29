import java.util.*;

public class Next_Greater_ele {
    public static int[] find_next_Greater(int ar[]){
        int n = ar.length;
        int ans[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i<n;i++){
            while(!stk.isEmpty() && ar[i]>ar[stk.peek()]){
                //Putting next greater ele
                ans[stk.pop()] = ar[i];
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            ans[stk.pop()] = -1;
        }

        return ans;
    }
    public static void main(String[] args) {
        int ar[] = { 10, 2, 1, 3, 5, 4, 8, 7 };

        int ans[] = find_next_Greater(ar);
        for(int i = 0;i<ar.length;i++) System.out.print(ans[i]+" ");
    }
}
