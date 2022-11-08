public class quickSortADV {
    private static void QuickSort(int ar[],int start,int end){
        if(start>=end) return;

        int l = start;
        int r = end;
        int p = ar[l + (r-l)/2];
        while(l<=r){
            while(l<=r && ar[l]<p) l++;
            while(l<=r && ar[r]>p) r--;
            if(l<=r){
                int temp = ar[l];
                ar[l] = ar[r];
                ar[r] = temp;
                l++;
                r--;
            }
        }
        QuickSort(ar, start, r);
        QuickSort(ar, l, end);
    }
    private static void sortArray(int ar[]){
        QuickSort(ar, 0, ar.length-1);
    }
    public static void main(String[] args) {
        int ar[] = {2,1,2,4,5,1,2,4,1,6,7,9};
        
        sortArray(ar);

        for(int i = 0;i<ar.length;i++) System.out.print(ar[i]+" ");
    }
    
}
