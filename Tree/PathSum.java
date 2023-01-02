public class PathSum {
    public static boolean isPath(TreeNode root,int target){
        if(root==null && target==0) return true;
        if(root==null) return false;
        target = target-root.val;
        if(root.left==null && root.right==null){
            if(target==0) return true;
            else return false;
        }

        return isPath(root.left, target)||isPath(root.right, target);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(isPath(root,10));
    }
}
