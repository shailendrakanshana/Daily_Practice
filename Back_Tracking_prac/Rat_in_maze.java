import java.util.*;
public class Rat_in_maze {
    public static boolean find_Path(char[][] maze,int[][] res,int x,int y,int[] row,int[] col) {
        if(x == maze.length - 1 && y == maze[0].length - 1) {
            res[x][y] = 1;
            for (int[] an : res) {
                for (int j = 0; j < res[0].length; j++) {
                    System.out.print(an[j] + " ");
                }
                System.out.println();
            }
            return true;
        }
        if(x < 0 || y < 0 || x == maze.length|| y == maze[0].length || maze[x][y] == 'X'){
			return false;
		}
        res[x][y] = 1;
        maze[x][y] = 'X';
        for(int i = 0; i < row.length; i++) {
            if(find_Path(maze,res,x + row[i],y + col[i],row,col)){
				return true;
			}
        }
        maze[x][y] = 'O';
        res[x][y] = 0;
        return false;
    }
	public static void main(String[] args) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for(int i = 0; i < n; i++) {
            String temp = sc.next();
            maze[i] = temp.toCharArray();
        }
        int[] row = {0,-1,1,0};
        int[] col = {1,0,0,-1};
        int[][] res = new int[n][m];
        res[0][0] = 0;
        if(!find_Path(maze,res,0,0,row,col)){
			System.out.println(-1);
		}
    }
}