
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
public class RangeSum_BST {
    int s;
    public void getRange(TreeNode root,int l,int h){
        if(root==null) return;
        int a = root.val;
        if(a>=l && a<=h){
            s = s + a;
            getRange(root.left,l,h);
            getRange(root.right,l,h);
        }
        else if(a>h) getRange(root.left,l,h);
        else if(a<l) getRange(root.right,l,h);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        s = 0;
        getRange(root,low,high);
        return s;
    }
}
