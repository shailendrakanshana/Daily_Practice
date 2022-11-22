public class mergeSort {
    public static int[] merge_Sort(int ar[],int l,int h){
        if(l==h){
            int br[] = new int[1];
            br[0] = ar[l];
            return br;
        }
        int mid = (l+h)/2;
        int cr[] = merge_Sort(ar, l, mid);
        int dr[] = merge_Sort(ar, mid+1, h);
        return merge(cr, dr);
    } 
    public static int[] merge(int ar[],int br[]){
        int n = ar.length;
        int m = br.length;
        int merge_arr[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m){
            if(ar[i]<br[j]){
                merge_arr[k] = ar[i];
                i++;
                k++;
            }
            else{
                merge_arr[k] = br[j];
                j++;
                k++; 
            }
        }
        while(i<n){
            merge_arr[k] = ar[i];
            k++;
            i++;
        }
        while(j<m){
            merge_arr[k] = br[j];
            k++;
            j++;
        }
        return merge_arr;
    }
    public static void main(String[] args) {
        int ar[] = {5,2,1,3,4,2,1,4,5,6};
        int ans[] = merge_Sort(ar, 0, ar.length-1);
        for(int i = 0;i<ans.length;i++) System.out.print(ans[i]+" ");
    }
    
}
