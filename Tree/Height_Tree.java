public class Height_Tree {
    public static int Height(TreeNode root){
        if(root ==null) return 0;
        else return 1+Math.max(Height(root.left),Height(root.right));
    }
    public static boolean isBalanced(TreeNode root){
        if( root==null) return true;
        int lh = Height(root.left);
        int rh = Height(root.right);

        if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right)) return true;
        else return false;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println(Height(root));
        System.out.println(isBalanced(root));
    }
}