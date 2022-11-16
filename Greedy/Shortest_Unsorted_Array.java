import java.util.*;

public class Shortest_Unsorted_Array {
    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int ar[] = new int[n];
        for(int i  =0;i<n;i++) ar[i] = nums[i];
        Arrays.sort(nums);
        int start = -1;
        for(int i = 0;i<n;i++){
            if(ar[i]!=nums[i]){
                start = i;
                break;
            }
        }
        int end = -1;
        for(int i =n-1;i>=0;i--){
            if(ar[i]!=nums[i]){
                end = i;
                break;
            }
        }
        if(start==-1 || end==-1) return 0;
        return end-start+1;
        
    }
    public static void main(String[] args) {
        int nums[] = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
    
}
