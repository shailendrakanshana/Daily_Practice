public class quickSort{
    private static void swap(int ar[],int i,int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    private static int partition(int ar[],int f,int l){
        int t = f;
        for(int i = f;i<l;i++){
            if(ar[i]<ar[l]){
                swap(ar, t, i);
                t++;
            }
        }
        swap(ar, t, l);
        return t;
    }
    private static void sort(int ar[],int f,int l){
        if(f<l){
            int p = partition(ar, f, l);
            sort(ar, f, p-1);
            sort(ar, p+1, l);
        }
    }
    private static void sortArray(int ar[]){
        sort(ar, 0, ar.length-1);
    }
    public static void main(String[] args) {
        int ar[] = {2,1,2,4,5,1,2,4,1,6,7,9};
        
        sortArray(ar);

        for(int i = 0;i<ar.length;i++) System.out.print(ar[i]+" ");
    }
}