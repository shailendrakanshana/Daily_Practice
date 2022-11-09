/*PROBLEM STATEMENT - WE ARE GIVEN N ITEM WITH THE WEIGHTS AND THEIR VALUE AND WE HAVE GIVEN A KNAPSACK CAPACITY [LIKE A BAG] AND
 * WE HAVE TO FIND THE MAXIMUM VALUE IN THE BAG WE CAN PUT
 * 
 * Like for import N = 3
 *   Weights :  50      30    20
 *   Values  :  600     400   500
 *   CAP = 70
 * 
 * OUTPUT = 1140 , [Explanation: cap = 70 , tool 20 weight and 30 weight the ans = 900 the we will take 20 from 50 weight 20*600/50   ans = 1140]
 */

import java.util.*;

public class Fraction_knapsack {
    public static double find_Max_weight(double ar[][],double cap){
        int n = ar.length;
        //Sorting the array on the basis of fraction of value and weight 
        Arrays.sort(ar,(a,b)-> Double.compare((a[1]/a[0]),(b[1]/b[0])));
        double res = 0;
        for(int i = n-1;i>=0;i--){
            if(cap>=ar[i][0]){
                res = res + ar[i][1];
                cap = cap - ar[i][0];
            }
            else{
                res = res + (cap*ar[i][1])/ar[i][0];
                break;
            }
        }
        return res;

        // for(int  i =0;i<n;i++){
        //     System.out.println(ar[i][0]+" "+ar[i][1]);
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ar[][] = new double[n][2];
        for(int i = 0;i<n;i++){
            ar[i][0] = sc.nextDouble();
            ar[i][1] = sc.nextDouble();
        }
        double capacity = sc.nextDouble();
        System.out.println(find_Max_weight(ar,capacity));
    }
}
