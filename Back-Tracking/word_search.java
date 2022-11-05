public class word_search {
    public static boolean exist(char[][] board, String word,int col,int row,int idx){
        if(idx==word.length()) return true;

        if(row<0 || col <0 || col>=board[0].length || row>=board.length || board[row][col]!=word.charAt(idx)) return false;

        board[row][col] = '*';

        int r[] = {-1,1,0,0};
        int c[] = {0,0,-1,1};
        for(int i = 0;i<c.length;i++){
            boolean ans = exist(board, word, col+c[i], row+r[i], idx+1);
            if(ans) return true;
        }
        board[row][col] = word.charAt(idx);
        return false;

    }
    public static void main(String[] args) {
        char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};//{{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String word = "ABCCED";
        boolean ans = false;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    ans = exist(board, word, j, i, 0);
                    if(ans) break;
                }
            }
            if(ans) break;
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(ans);

    }
    
}
