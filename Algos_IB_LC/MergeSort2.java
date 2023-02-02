public class MergeSort2 {
    public static int[] merge(int ar[],int br[]){
        int n = ar.length;
        int m = br.length;
        int ans[] = new int[n+m];

        int i = 0;
        int j = 0;
        int k  =0;
        while(i<n&&j<m){
            if(ar[i]<br[j]){
                ans[k] = ar[i];
                k++;
                i++;
            }
            else{
                ans[k] = br[j];
                j++;
                k++;
            }
        }
        //For remaining elements
        while(i<n){
            ans[k] = ar[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k] = br[j];
            k++;
            j++;
        }

        return ans;
    }
    //Main merge sort function
    public static int[] mergeSort(int ar[],int l,int h){
        if(l==h){
            int br[] = new int[1];
            br[0] = ar[l];
            return br;
        }
        
        int m = l - (l-h)/2;

        int br[] = mergeSort(ar, l, m);
        int cr[] = mergeSort(ar, m+1, h);

        return merge(br, cr);
    }
    public static void main(String[] args) {
        int ar[] = {5,2,1,3,4,2,1,4,5,6};
        ar = mergeSort(ar, 0, ar.length-1);

        for(int i = 0;i<ar.length;i++) System.out.print(ar[i]+" ");
    }
}
