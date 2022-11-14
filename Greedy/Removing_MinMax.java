/*PROBLEM STATEMENT : 2091 
 * 
 * You are given a 0-indexed array of distinct integers nums.

There is an element in nums that has the lowest value and an element that has the highest value. 
We call them the minimum and maximum respectively.
 Your goal is to remove both these elements from the array.

A deletion is defined as either removing an element from the front of the array or removing an element from the back of the array.

Return the minimum number of deletions it would take to remove both the minimum and maximum element from the array.
 
 * 
 */



public class Removing_MinMax {
    public static int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n==1 || n==2) return n;
        int maxIndex = -1;
        int minIndex = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minIndex = i;
            }
        }
        //System.out.println(minIndex+"  "+maxIndex);
        
        int ans1 = Math.max(maxIndex,minIndex)+1;
        int ans2 = n - Math.min(maxIndex,minIndex);
        int ans3 = Math.min(maxIndex,minIndex)+1+n-Math.max(maxIndex,minIndex);

        return Math.min(ans1,Math.min(ans2,ans3)); 

    }
    public static void main(String[] args) {
        int nums[] = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));
    }
}
