package LinkedList;

/**
 * Created by manishpurohit on 7/18/18.
 */
public class deleteAtMiddle {
    public static ListNode delete(ListNode head, int position) {

        if(head == null || head.next == null)
            return null;

        if(position == 1) {
            head = head.next;
            return head;
        }
        ListNode temp = head;
        int count = 1;
        while (count < position-1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if(temp != null)
        temp.next = temp.next.next;

        return head;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(10);
        listNode.next = new ListNode(42);
        listNode.next.next = new ListNode(12);
        listNode.next.next.next = new ListNode(8);

        ListNode delete = delete(listNode,1);
        while (delete != null) {
            System.out.println(delete.data);
            delete = delete.next;
        }
    }
}
