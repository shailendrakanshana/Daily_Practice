import java.util.*;

class Contiguous_Array {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        //Converting all zeros to -1 for sum = 0 approach
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
        }

        int max = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];

            if(sum==0) max = Math.max(max,i+1);//Storing the maxLength

            if(map.containsKey(sum)){
                max = Math.max(max,i-map.get(sum));//a+b+c = d , if a = d then b+c = 0 concept
            }
            else{
                map.put(sum,i);
            }
        }
        return max;

    }
}