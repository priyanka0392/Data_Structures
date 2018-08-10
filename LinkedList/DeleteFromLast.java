package LinkedList;

public class DeleteFromLast {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            temp = temp.next;
            length++;
        }

        if(length < n)
            return head;

        int count = 0;

        while (count < n) {
            fast = fast.next;
            count++;
        }


        if(length == count) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if(slow != null)
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(10);
        listNode.next = new ListNode(42);
        listNode.next.next = new ListNode(12);
        listNode.next.next.next = new ListNode(8);

        removeNthFromEnd(listNode,7);
    }
}
