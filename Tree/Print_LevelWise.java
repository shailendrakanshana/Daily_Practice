public class Print_LevelWise {
    public static int Height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(Height(root.left), Height(root.right));
    }

    public static void Print_LW(TreeNode root,int level){
        if(root==null) return;
        //For solo node
        if(level==1) System.out.print(root.val+" ");
        else{
            Print_LW(root.left, level-1);
            Print_LW(root.right, level-1);
        }   
    }

    //LEVEL ORDER TRAVERSAL FUNCTION
    public static void LOT(TreeNode root){
        int h = Height(root);
        for(int i = 1;i<=h;i++){
            System.out.println("Level #"+i);
            Print_LW(root, i);
            System.out.println();
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
        LOT(root);
    }
}
