public class merge_between {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = null;
        ListNode tail = null;
        int r = (b-a+1);
        while(a-->0){
            ListNode n = new ListNode(list1.val);
            if(tail==null){
                head=n;
                tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }
            list1 = list1.next;
        }
        while(list2!=null){
            ListNode n = new ListNode(list2.val);
            if(tail==null){
                head = n;
                tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }
            list2 = list2.next;
        }
        while(r-->0) list1 = list1.next;
        while(list1!=null){
            ListNode n = new ListNode(list1.val);
            if(tail==null){
                head = n;
                tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }
            list1 = list1.next;
        }
        return head;

    }
}
