public class Reverse_LinkedList {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    static node head;
    static node tail;
    
    //INSERT FUNCTION
    static void insert(int x){
        node n = new node(x);
        if(tail==null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }

    static void printLL(node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    //REVERSING THE LINKEDLIST USING RECURSION
    static node reverse(node head){
        if(head==null) return null;
        if(head.next==null) return head;

        node newhead = reverse(head.next);

        //Changing references
        head.next.next = head;
        head.next = null;

        //Returning back newhead

        return newhead;
    }
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        printLL(head);

        node newhead = reverse(head);
        printLL(newhead);
    }
}
