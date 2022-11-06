public class Valid_Sudoku {
    public static boolean isSafe(char board[][],int row,int col,char k){
        for(int i = 0;i<9;i++){
            if(board[row][i]==k && i!=col) return false;
            if(board[i][col]==k && i!=row) return false;
            int p = 3*(row/3)+i/3;
            int q = 3*(col/3)+i%3;
            if(board[p][q]==k && p!=row && q!=col) return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        char board[][] = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        boolean b = true;
        for(int i = 0;i<9;i++){
            for(int j  =0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!isSafe(board, i, j, board[i][j])){
                        b = false;
                        break;
                    }
                }
            }
        }
        System.out.println(b);
    }
    
}
