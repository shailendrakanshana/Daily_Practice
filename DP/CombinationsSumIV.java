public class CombinationsSumIV {
    public static int combinationSum4(int[] nums, int target) {
        //DP approach understand again
        int dp[] = new int[target+1];
        dp[0] = 1;
        for(int i = 1;i<=target;i++){
            for(int j = 0;j<nums.length;j++){
                if(i>=nums[j]) dp[i] = dp[i] + dp[i-nums[j]];
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(combinationSum4(nums, 4));
    }
}
