import java.util.Scanner;

public class rat_cheese {
    /*public static boolean chaseCheese(char Board[][],int row){
        if(row==Board.length){
            return true;
        }
        for(int col = 0;col<Board[0].length;col++){
            if(wilMove(Board, row, col)){
                Board[row][col] = '1';
                if(chaseCheese(Board, row+1)){
                    return true;
                }
                Board[row][col] = '0';
            }
        }
        return false;
    }
    public static boolean wilMove(char Board[][],int row,int col){
        if(row>=Board.length-1){
            return true;
        }
        if(Board[row+1][col]=='X'){
            return false;
        }
        return true;
    }*/
    static boolean f = false;
    public static void HasPath(char maze[][],int col,int row,int ans[][]){
        if(row==maze.length-1 && col==maze[0].length-1 && maze[row][col]!='X' ){
            ans[row][col] = 1;
            Display(ans);
            f = true;
            return;
        }
        if(row<0 || col<0 || row>=maze.length || col>=maze[0].length || maze[row][col]=='X'){
            return;
        }
        maze[row][col] = 'X';
        ans[row][col] = 1;
        HasPath(maze, col, row-1,ans);//UP
        HasPath(maze, col, row+1,ans);//DOWN
        HasPath(maze, col-1, row,ans);//LEFT
        HasPath(maze, col+1, row,ans);//RIGHT
        maze[row][col] = 'O';
        ans[row][col] = 0;
    }
    public static void Display(int ans[][]){
        for(int i = 0;i<ans.length;i++){
            for(int j = 0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for(int i =0;i<n;i++){
            String s = sc.next();
            for(int j = 0;j<s.length();j++){
                maze[i][j] = s.charAt(j);
            }
        }
        int ans[][] = new int[n][m];

        HasPath(maze, 0, 0,ans);
        if(!f){
            System.out.println("NO PATH FOUND");
        }

    }
    
}
