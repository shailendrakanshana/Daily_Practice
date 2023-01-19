public class Flip_Tree_Check {
    public boolean isFlip(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null) return true;
        if(root1==null || root2==null) return false;

        if(root1.val!=root2.val) return false;
        //Recursive call for same
        boolean same = isFlip(root1.left,root2.left)&&isFlip(root1.right,root2.right);
        //For flip
        boolean flip = isFlip(root1.left,root2.right)&&isFlip(root1.right,root2.left);
        
        return (same || flip);
        
    }
}
