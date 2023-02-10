public class ReverseOddLevels {
    //Simple swapping values DFS
    public void solve(TreeNode root1,TreeNode root2,int level){
        if(root1==null || root2==null) return;
        if(level%2==1){
            //Swapping
            int temp = root1.val;
            root1.val = root2.val;
            root2.val = temp;
        }
        solve(root1.left,root2.right,level+1);
        solve(root1.right,root2.left,level+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        solve(root.left,root.right,1);
        return root;
    }
    public static void main(String[] args) {
        System.out.println("2415");
    }
}
