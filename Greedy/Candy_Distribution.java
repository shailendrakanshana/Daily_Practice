import java.util.*;

public class Candy_Distribution {
    public static int candy(int[] ratings) {
        //Relative to Right Array and Relative to left Array Approach
        int n = ratings.length;
        int leftAr[] = new int[n];
        int rightAr[] = new int[n];
        //Default all have atleast 1 candy
        Arrays.fill(leftAr,1);
        Arrays.fill(rightAr,1);
        //For left Array
        for(int i  =1;i<n;i++){
            if(ratings[i]>ratings[i-1]) leftAr[i] = leftAr[i-1] +1;
        }
        //For right Array
        for(int i = n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) rightAr[i] = rightAr[i+1] +1;
        }
        //Finding the max to get the count 
        int ans = 0;
        for(int i = 0;i<n;i++){
            ans = ans + Math.max(leftAr[i],rightAr[i]);
        }
        
        return ans;

    }
    public static void main(String[] args) {
        int ratings[] = {1,0,2,5,3,2,4,1};
        System.out.println(candy(ratings));
    }
}
