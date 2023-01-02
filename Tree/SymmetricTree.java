public class SymmetricTree {
    public static boolean isMirror(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null) return true;
        if(root1==null || root2==null) return false;

        return (root1.val==root2.val) && isMirror(root1.left, root2.right) && isMirror(root1.right,root2.left);
    }
    public static boolean isSymmetric(TreeNode root){
        return isMirror(root, root);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        System.out.println(isSymmetric(root));
    }
}
