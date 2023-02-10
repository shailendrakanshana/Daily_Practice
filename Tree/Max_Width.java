import java.util.*;

public class Max_Width {
    int max;
    HashMap<Integer,Integer> map;
    public int widthOfBinaryTree(TreeNode root) {
        max = 0;
        map = new HashMap<>();
        find_Width(root,0,0);
        return max;
    }
    public void find_Width(TreeNode root,int depth,int pos){
        if(root==null) return;
        map.putIfAbsent(depth,pos);
        max = Math.max(max,pos - map.get(depth)+1);
        //Multiplying by 2 because if we mark the tree then second level will be marked as 2,3
        find_Width(root.left,depth+1,pos*2);
        find_Width(root.right,depth+1,pos*2+1);
    }
    public static void main(String[] args) {
        System.out.println("Submitted - 662");
    }
}
