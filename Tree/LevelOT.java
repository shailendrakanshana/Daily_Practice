import java.util.*;

//Using Queue - TimeComplezity : O(N^2)

public class LevelOT {
    static List<List<Integer>> r;
    public static void level_Order_Trav(TreeNode root){
        r = new ArrayList<>();
        if(root==null) return;
        //Initializing queue
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int nodeCount = q.size();
            List<Integer> l = new ArrayList<>();
            while(nodeCount>0){
                TreeNode curNode = q.poll();
                l.add(curNode.val);
                if(curNode.left!=null) q.add(curNode.left);
                if(curNode.right!=null) q.add(curNode.right);

                nodeCount--;
            }
            r.add(l);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        level_Order_Trav(root);
        System.out.println(r);
    }
}
