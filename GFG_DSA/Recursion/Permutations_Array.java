import java.util.*;

public class Permutations_Array {
    public static void print_per(int ar[],int start,ArrayList<ArrayList<Integer>> ans){
        if(start==ar.length){
            ans.add(toList(ar));
        }
        for(int i = start;i<ar.length;i++){
            swap(ar,start,i);
            print_per(ar, start+1, ans);
            swap(ar, start, i);
        }
    }
    public static ArrayList<Integer> toList(int ar[]){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0;i<ar.length;i++) l.add(ar[i]);
        return l;
    }
    public static void swap(int ar[],int i,int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        print_per(ar, 0, ans);
        System.out.println(ans);
    }
    
}
