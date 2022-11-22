import java.util.*;

public class Top_K_frequent_Ele {
    public static void quickSort(int ar[],int res[],int start,int end){
        if(start>=end) return;
        int l = start;
        int r = end;
        int p = ar[l+(r-l)/2];
        while(l<=r){
            while(l<=r&&p>ar[l]) l++;
            while(l<=r&&p<ar[r]) r--;
            if(l<=r){
                int temp = ar[l];
                ar[l] = ar[r];
                ar[r] = temp;
                int cemp = res[l];
                res[l] = res[r];
                res[r] = cemp;
                l++;
                r--;
            }
        }
        quickSort(ar,res,l,end);
        quickSort(ar,res,start,r);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int res[] = new int[n+1];
        int count[] = new int[n+1];
        int c = 1;
        int idx = 0;
        for(int i = 0;i<n-1;i++){
            if(nums[i]==nums[i+1]) c++;
            else{
                res[idx] = nums[i];
                count[idx] = c;
                c = 1;
                idx++;
            }
        }
        res[idx] = nums[n-1];
        count[idx] = c;
        quickSort(count,res,0,idx);
        int ar[] = new int[k];
        int p = 0;
        for(int i = idx;i>=0&&k-->0;i--){
            ar[p] = res[i];
            p++;
        }
        return ar;

    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        int ar[] = topKFrequent(nums, k);
        for(int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
