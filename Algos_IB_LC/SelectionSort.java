public class SelectionSort {
    public static int find_Smallest(int ar[],int a){
        int ans[] = new int[2];
        ans[0] = Integer.MAX_VALUE;
        for(int i  =a;i<ar.length;i++){
            if(ar[i]<ans[0]){
                ans[0] = ar[i];
                ans[1] = i;
            }
        }
        return ans[1];
    }
    public static void Selection_Sort(int ar[]){
        for(int i =0;i<ar.length;i++){
            int idx = find_Smallest(ar, i);
            int temp = ar[idx];
            ar[idx] = ar[i];
            ar[i] = temp;
        }
    }
    public static void main(String[] args) {
        int ar[] = {2,1,4,1,2,11,34,21,4,51,56,12};
        Selection_Sort(ar);
        for(int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
