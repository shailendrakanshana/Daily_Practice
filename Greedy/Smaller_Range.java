import java.util.*;

public class Smaller_Range {
    public static int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int r = nums[n-1] - nums[0];
        for(int i = 0;i<n-1;i++){
            int j = i+1;
            int max = Math.max(nums[n-1]-k,nums[i]+k);
            int min = Math.min(nums[0]+k,nums[j]-k);
            r = Math.min(r,max-min);
        }
        return r;
    }
    public static void main(String[] args) {
        int ar[] = {7,8,8,5,2};
        System.out.println(smallestRangeII(ar, 4));
    }
}
