public class Diameter {
    public int Height(TreeNode root){
        if(root==null) return -1;
        return 1 + Math.max(Height(root.left),Height(root.right));
    }
    public int Find_Diameter(TreeNode root){
        if(root==null) return 0;
        //finding Heights
        int lh = Height(root.left);
        int rh = Height(root.right);
        //Finding Diamters
        int ld = Find_Diameter(root.left);
        int rd = Find_Diameter(root.right);

        return Math.max(lh+rh+2, Math.max(ld,rd));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Diameter obj = new Diameter();
        System.out.println(obj.Find_Diameter(root));
    }
}
