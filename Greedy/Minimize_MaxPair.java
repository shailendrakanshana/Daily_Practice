/*PROBLEM STATEMENT : 1877
 * The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.

For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:

Each element of nums is in exactly one pair, and
The maximum pair sum is minimized.
Return the minimized maximum pair sum after optimally pairing up the elements.
 * 
 */

import java.util.*;

public class Minimize_MaxPair {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int m = 0;
        int i  = 0;
        int j = nums.length-1;
        while(j>i){
            m = Math.max(nums[i]+nums[j],m);
            i++;
            j--;
        }
        return m;
    }
    public static void main(String[] args) {
        int nums[] = {3,5,4,2,4,6};
        System.out.println(minPairSum(nums));
    }
}
