public class Convert_Binary {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void insert(ListNode head){
        
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }
    public int getDecimalValue(ListNode head) {
        ListNode newhead = reverse(head);
        ListNode temp = newhead;
        int ans = 0;
        int c = 0;
        while(temp!=null){
            int r = temp.val;
            ans = ans + r*(int)Math.pow(2,c);
            c++;
            temp = temp.next;
        }
        return ans;
    }
}
