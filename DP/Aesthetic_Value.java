import java.util.*;

public class Aesthetic_Value {
    public static int find_P(int ar[]){
        for(int i= 0;i<ar.length;i++){
            if(ar[i]==Integer.MAX_VALUE) return i;
        }
        return -1;
    }
    public static int find_Aes(int ar[],int b){
        int n = ar.length;
        Arrays.sort(ar);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(ar[i])) map.put(ar[i], map.get(ar[i])+1);
            else map.put(ar[i],1);
        }
        // System.out.println(map);
        Arrays.fill(ar,Integer.MAX_VALUE);
        int p = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int a = entry.getKey();
            int v = entry.getValue();
            //To fill at the postion of i+b
            //Storing COpy of p for next turn
            while(v-->0){
                ar[p] = a;
                p = p+b;
                if(p>=n){
                    p = find_P(ar);
                }
            }
        }
        int ans = 0;
        for(int i = 0;i<n;i++) System.out.print(ar[i]+" ");
        System.out.println();
        //Finding ANS
        for(int i = 0;i+b<n;i++){
            // System.out.println(ans);
            ans = ans + Math.abs(ar[i]-ar[i+b]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int ar[] = {3,-5,3,-5,3};
        int b = 2;
        // int ar[] = {4,3,4,3,2,5};
        // int b = 3;
        System.out.println(find_Aes(ar, b));

    }
}
