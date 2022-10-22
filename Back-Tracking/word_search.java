public class word_search {
    public static boolean exist(char[][] board, String word,int row,int i){
        if(row==board.length-1 && i<word.length()-1){
            return false;
        }
        if(i>=word.length()-1){
            return true;
        }
        for(int col = 0;col<board.length;col++){
            if(isWord(board,word,row,col,i)){
                i = i+1;
                if(exist(board, word, row+1, i)){
                    return true;
                }
                i = i-1;
            }
        }
        return false;

    }
    public static boolean isWord(char board[][],String word,int row,int col,int i){
        if(board[row][col]== word.charAt(i)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board,word , 0, 0));

    }
    
}
