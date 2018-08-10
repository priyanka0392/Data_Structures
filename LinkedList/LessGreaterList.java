package LinkedList;

public class LessGreaterList {

    public static ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode small = null;
        ListNode equal = null;
        ListNode greater = null;

        while(temp != null) {
            if(temp.data < x) {
                small = temp;
                small.next.next = null;
                small = small.next;

            }
            if(temp.data == x) {
                equal = temp;
                equal.next.next = null;
                equal = equal.next;
            }
            if(temp.data > x) {
                greater = temp;
                greater.next.next = null;
                greater = greater.next;
            }
            temp = temp.next;
        }
        while (small.next != null)
            small = small.next;

        if(small == null) {
            ListNode equalTemp = equal;
            while (equal.next != null) {
                equal = equal.next;
            }
            equal.next = greater;
        }
        else {
            ListNode smallTemp = small;
            small.next = equal;
            while (small.next != null) {
                small = small.next;
            }
            small.next = greater;
        }

        if(small == null)
            return equal;
        else return small;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(10);
        listNode.next = new ListNode(42);
        listNode.next.next = new ListNode(12);
        listNode.next.next.next = new ListNode(8);

        partition(listNode,12);
    }
}
