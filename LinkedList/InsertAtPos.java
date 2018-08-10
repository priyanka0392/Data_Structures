package LinkedList;

import Tree.TreeNode;

public class InsertAtPos {

    public static ListNode insertAtPosition(ListNode head, int data, int pos) {
        if(head == null) {
            head = new ListNode(data);
            return head;
        }
        if(pos ==1) {
            ListNode temp = head;
            head = new ListNode(data);
            head.next = temp;
            return head;
        }
    int count = 1;
    ListNode curr = head;
    while (count < pos-1) {
        count++;
        curr = curr.next;
    }
    ListNode temp = curr.next;
    curr.next = new ListNode(data);
    curr.next.next = temp;

    return head;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(10);
        listNode.next = new ListNode(42);
        listNode.next.next = new ListNode(12);
        listNode.next.next.next = new ListNode(8);

        insertAtPosition(listNode,34,1);
    }
}
