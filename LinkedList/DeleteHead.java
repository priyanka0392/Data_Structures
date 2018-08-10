package LinkedList;

public class DeleteHead {

    public ListNode deleteAtHead(ListNode head) {
        if(head == null || head.next == head)
            return null;
        ListNode temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;

        return head;
    }
}
