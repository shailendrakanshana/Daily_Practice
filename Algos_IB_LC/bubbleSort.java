public class bubbleSort {
    public static void sortByPoints(int ar[]){
        int n = ar.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(ar[j]>ar[i]){
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int ar[] = {1,4,2,1,2,4,1,3};
        sortByPoints(ar);
        for(int i = 0;i<ar.length;i++) System.out.print(ar[i]+" ");
    }
    
}
