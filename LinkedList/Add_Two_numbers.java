public class Add_Two_numbers {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);
        ListNode head = null;
        ListNode tail = null;
        int c = 0;
        while(temp1!=null && temp2!=null){
            int r = temp1.val + temp2.val + c;
            c = r/10;
            int p = r%10;
            ListNode n = new ListNode(p);
            if(tail==null){
                head = n;
                tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1!=null){
            int r = temp1.val + c;
            c = r/10;
            int p = r%10;
            ListNode n = new ListNode(p);
            if(tail==null){
                head = n;
                tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }
            temp1 = temp1.next;
        }
        while(temp2!=null){
            int r = temp2.val + c;
            c = r/10;
            int p = r%10;
            ListNode n = new ListNode(p);
            if(tail==null){
                head = n;
                tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }
            temp2 = temp2.next;
        }
        if(c>0){
            ListNode n = new ListNode(c);
            if(tail==null){
                head = n;
                tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }

        }
        ListNode res = reverse(head);
        return res;
    }
}
