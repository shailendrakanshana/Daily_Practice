public class Print_Prime {
    public static void print_Prime(int n){
        boolean ar[] = new boolean[n+1];
        ar[1] = true;
        for(int i = 2;i<=n;i++){
            if(ar[i]==false){
                for(int j = 2;i*j<=n;j++){
                    ar[i*j] = true;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if(!ar[i]) System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        print_Prime(20);
    }
}
