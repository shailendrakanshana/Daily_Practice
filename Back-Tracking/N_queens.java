
public class N_queens {
    public static boolean PlaceQueens(String[][] Board,int row){
        if(row==Board.length){
            return true;
        }
        for(int col = 0;col<Board.length;col++){
            if(safeCheck(Board, row, col)){
                Board[row][col] = "Q";
                if(PlaceQueens(Board, row+1)){
                    return true;
                }
                Board[row][col] = ".";
            }
        }
        return false;

    }
    public static boolean safeCheck(String[][] Board,int row,int col){
        int n = Board.length;
        for(int i = 0;i<n;i++){
            if(Board[row][i]=="Q"){
                return false;
            }
        }
        for(int i = 0;i<n;i++){
            if(Board[i][col]=="Q"){
                return false;
            }
        }
        int a = row;
        int b = col;
        while(a<n&&b<n){
            if(Board[a][b]=="Q"){
                return false;
            }
            a++;
            b++;
        }
        a = row;
        b = col;
        while(a>=0&&b>=0){
            if(Board[a][b]=="Q"){
                return false;
            }
            a--;
            b--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        String Board[][] = new String[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                Board[i][j] = ".";
            }
        }
        PlaceQueens(Board, 0);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
