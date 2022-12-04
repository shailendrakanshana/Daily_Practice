public class N_queens {
    public static int place_Queen(boolean[][] board,int q,int row){
        if(q==0){
            print(board);
            System.out.println("---------");
            return 1;
        }
        int res = 0;
        for(int col = 0;col<board.length;col++){
            if(isSafe(board, col, row)){
                board[row][col] = true;
                res  =res + place_Queen(board, q-1, row+1);
                board[row][col] = false;
            }
        }
        return res;
    }
    public static boolean isSafe(boolean[][] board,int col,int row){
        for (int r=row;r>= 0;r--) {
			if (board[r][col]) return false;
		}
		for (int r=row,c=col;r>=0 && c>=0;r--,c--) {
			if (board[r][c]) return false;
		}
		for (int r=row,c=col;r >= 0 && c < board.length;r--,c++) {
			if (board[r][c]) return false;
		}
		return true;
    }
    public static void print(boolean b[][]){
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b.length;j++){
                if(b[i][j]) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        boolean board[][] = new boolean[4][4];
        System.out.println(place_Queen(board, 4, 0));
    }
    
}
