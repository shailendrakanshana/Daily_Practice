import java.util.*;

public class Print_Permutations{
    public static void print_per(int ar[],int start,List<List<Integer>> r){
        if(start==ar.length){
            r.add(toList(ar));
            return;
        }
        for(int i = start;i<ar.length;i++){
            swap(i, start, ar);
            print_per(ar, start+1, r);
            swap(i, start, ar);
        }
    }
    public static List<Integer> toList(int ar[]){
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<ar.length;i++) l.add(ar[i]);
        return l;
    }
    public static void swap(int i,int j,int ar[]){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4};
        List<List<Integer>> r = new ArrayList<>();
        print_per(ar, 0, r);
        System.out.println(r);
    }
}