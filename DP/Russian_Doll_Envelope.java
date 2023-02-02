import java.util.*;

public class Russian_Doll_Envelope {
    //Binary search to find the fit possition of height
    public static int Binary_Search(int ar[],int start,int end,int target){
        int m = start - (start-end)/2;
        while(end>start){
            if(ar[m]==target) return m;
            if(ar[m]>target) end = m;
            if(ar[m]<target) start = m+1;

            m = start - (start-end)/2;
        }
        return start;
    }
    public static int maxEnvelopes(int[][] ar) {
        //Applying binary search wiht DP Array and custom sorting
        //Sorting based on width if widths are equal then sort desc based on height
        Arrays.sort(ar, (a,b) -> (a[0]==b[0])?(b[1]-a[1]):(a[0]-b[0]));

        int dp[] = new int[ar.length];
        int len = 0;

        for(int i  =0;i<ar.length;i++){
            //Applying binary search for height

            int index = Binary_Search(dp,0,len,ar[i][1]);
            dp[index] = ar[i][1];
            if(index==len) len++;
        }
        return len;
    }
    public static void main(String[] args) {
        int ar[][] = {{5,4},{6,4},{6,7},{2,3}};
        System.out.println(maxEnvelopes(ar));
    }
}
