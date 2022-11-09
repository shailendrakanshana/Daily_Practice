/*Maximize the profit in given deadline ar[i][0] = deadline ar[i][1] = profit */


import java.util.*;

public class Job_Sequence_Problem {
    public static int find_Max_Profit(int ar[][]){
        int max = 0;
        int n = ar.length;
        for(int i = 0;i<n;i++) max = Math.max(ar[i][0],max);
        Arrays.sort(ar,(a,b)-> Integer.compare(b[1], a[1]));
        int slots[] = new int[max];
        boolean b[] = new boolean[max];
        for(int i =0;i<ar.length;i++){
            for(int j = Math.min(max-1,ar[i][0]-1);j>=0;j--){
                //Empty slot found
                if(b[j]==false){
                    b[j] = true;
                    slots[j] = ar[i][1];
                    break;
                }
            }
        }
        // for(int i = 0;i<ar.length;i++){
        //     System.out.println(ar[i][0]+" "+ar[i][1]);
        // }
        // return 0;
        //System.out.println("JOBS ARE HERE\n\n");
        int ans = 0;
        for(int i = 0;i<max;i++){
           // System.out.print(slots[i]+" ");
           ans = ans + slots[i];
        }
        return ans;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int jobs[][] = new int[n][2];
        for(int  i =0 ;i<n;i++){
            jobs[i][0] = sc.nextInt();
            jobs[i][1] = sc.nextInt();
        }
        System.out.println(find_Max_Profit(jobs));

    }
}
