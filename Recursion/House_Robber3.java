import java.util.*;

public class House_Robber3 {
    HashMap<TreeNode, Integer> map = new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null) return 0;
        if(map.containsKey(root)) return map.get(root);
        //Adding Alternate Values
        int sum = root.val;
        //Checking for next to next level
        if(root.left!=null){
            sum = sum + rob(root.left.left);
            sum  =sum + rob(root.left.right);
        }
        if(root.right!=null){
            sum =  sum + rob(root.right.left);
            sum  =sum + rob(root.right.right);
        }
        //After that adding res add positions
        int osum = rob(root.left) + rob(root.right);

        int ans = Math.max(osum,sum);
        //Memoization
        map.put(root,ans);
        return ans;
    }
}
