// You are given a 0-indexed integer array nums of length n.

// The average difference of the index i is the absolute difference between the average of the first i + 1 elements of nums and the average of the last n - i - 1 elements. Both averages should be rounded down to the nearest integer.

// Return the index with the minimum average difference. If there are multiple such indices, return the smallest one.

// Note:

// The absolute difference of two numbers is the absolute value of their difference.
// The average of n elements is the sum of the n elements divided (integer division) by n.
// The average of 0 elements is considered to be 0.


public class Minimum_Avg_Diff {
    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long minAvg = Integer.MAX_VALUE;
        int ans = -1;
        long sum = 0;
        for(int i = 0;i<n;i++) sum = sum + nums[i];
        int r = n;
        long curSum = 0;
        for(int i = 0;i<n;i++){
            curSum = curSum + nums[i];
            sum = sum - nums[i];
            r--;
            long avg = 0;
            if(r==0){
                avg =(long) Math.abs(curSum/(i+1));
            }
            else{
                avg = (long)Math.abs((curSum/(i+1))-(sum/r));
            }
            if(avg<minAvg){
                minAvg = avg;
                ans = i;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int ar[] = {2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(ar));
    }
    
}
