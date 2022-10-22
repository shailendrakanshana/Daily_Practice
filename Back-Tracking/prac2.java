//permutations with for an array

import java.util.*;

public class prac2 {
    public static void permutations(int ar[],int start,List<List<Integer>> r){
        if(start==ar.length){
            r.add(toList(ar));
            return;
        }
        for(int i = start;i<ar.length;i++){
            swap(start, i, ar);
            permutations(ar, start+1, r);
            swap(start, i, ar);
        }
    }
    public static List<Integer> toList(int[] ar){
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<ar.length;i++){
            l.add(ar[i]);
        }
        return l;
    }
    public static void swap(int i,int j,int ar[]){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3};
        List<List<Integer>> r = new ArrayList<>();
        permutations(ar, 0, r);
        System.out.println(r);
    }
    
}
