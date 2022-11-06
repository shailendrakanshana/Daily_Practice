public class Sudoku_Solver {
    static int REDIX = 10;
    public static boolean Solver(char board[][]){
        for(int i  = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]=='.'){
                    for(int k = 1;k<=9;k++){
                        char c = Character.forDigit(k,REDIX);
                        if(isSafe(board,i,j,c)){
                            board[i][j] = c;
                            if(Solver(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSafe(char board[][],int row,int col,char k){
        for(int i = 0;i<9;i++){
            if(board[row][i]==k) return false;
            if(board[i][col]==k) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==k) return false; 
        }
        return true;
    }

    public static void main(String[] args) {
        char board[][] = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};

        Solver(board);

        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
