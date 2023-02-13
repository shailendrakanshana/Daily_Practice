public class LinkedListToBST {
    //Finding middle element and recursive call approach
    public TreeNode solve(ListNode head,ListNode tail){
        //Base case
        if(head==tail) return null;
        //Finding middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=tail && fast.next!=tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = solve(head,slow);
        root.right  =solve(slow.next,tail);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        return solve(head,null);
    }
    public static void main(String[] args) {
        System.out.println("109");
    }
}
