public class Patching_Array  {
    public static int minPatches(int[] ar, int n) {
        int i = 0;
        long missingNumber = 1;
        int ans = 0;
        while(missingNumber<=n){
            if(i<ar.length && missingNumber>=ar[i]){
                missingNumber = missingNumber + ar[i];
                i++;
            }
            else{
                missingNumber = missingNumber*2;
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ar[] = {1,5,10};
        System.out.println(minPatches(ar, 33));
    }
}