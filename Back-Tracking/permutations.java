//Print the all permutation to arrange 2 queens in 4 rooms (4P2)

public class permutations{
    public static void printper(boolean[] room,int tq,int j,String ans){
        if(j==tq){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<room.length;i++){
            if(room[i]==false){
                room[i] = true;
                printper(room, tq, j+1, ans+"b"+i+"q"+j);
                room[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[] room = new boolean[n];
        printper(room, tq, 0, "");

    }
}