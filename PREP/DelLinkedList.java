public class DelLinkedList {
    public static ListNode Del(ListNode head,int d){
        if(head.val==d) return head.next;
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.next.val==d){
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void Print(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        Print(head);
        head = Del(head, 4);
        Print(head);
    }
}
