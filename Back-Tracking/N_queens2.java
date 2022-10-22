import java.util.*;
public class N_queens2 {
    static List<List<String>> ans;
    public static void main(String[] args) {
        int n = 4;
        ans = new ArrayList<>();
        char Board[][] = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                Board[i][j] = '.';
            }
        }
        List<int[]> l = new ArrayList<>();
        PlaceQueens(Board, 0, l);
        System.out.println(ans);

    }
    public static void PlaceQueens(char[][] Board,int row,List<int[]> l){
        //Base condition
        if(l.size()==Board.length){
            List<String> rows = new ArrayList<>();
            for(int i = 0;i<Board.length;i++){
                rows.add(new String(Board[i]));
            }
            ans.add(rows);   
        }
        //Will add the queen
        for(int col = 0;col<Board.length;col++){
            if(safeCheck(l, row, col)){
                Board[row][col] = 'Q';
                l.add(new int[]{row,col});
                PlaceQueens(Board,row+1,l);
                Board[row][col] = '.';
                l.remove(l.size()-1);
            }
        }
        

    }
    public static boolean safeCheck(List<int[]> l,int row,int col){
        for(int[] ar:l){
            int a = Math.abs(ar[0]-row);
            int b = Math.abs(ar[1]-col);
            if(a==0 || b==0 ||a==b){
                return false;
            }
        }
        return true;
        
    }
    
}
