public class Array_Rotate_Match {
    public static boolean is_Equal(int mat[][],int copy[][]){
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++){
                if(mat[i][j]!=copy[i][j]) return false;
            }
        }
        return true;
    }
    public static void rotate_Mat(int mat[][]){
        //Best way to rotate matrix 90 degreee is -> transpose -> swap columns rotate is ready😎
        //FINDING TRANSPOSE
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //Column swap
        int f = 0;
        int l = mat.length - 1;
        while(f<l){
            for(int i = 0;i<mat.length;i++){
                int temp = mat[i][f];
                mat[i][f] = mat[i][l];
                mat[i][l] = temp;
            }
            f++;
            l--;
        }
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        //Making copy of mat
        int n = mat.length;
        for(int i = 0;i<4;i++){
            if(is_Equal(mat,target)) return true;
            rotate_Mat(mat);
        }
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = {{0,0,0},{0,1,0},{1,1,1}};
        int target[][] = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat, target));
    }
}