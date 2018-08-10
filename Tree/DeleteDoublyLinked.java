package Tree;

import Tree.DoublyLinkedNode;

public class DeleteDoublyLinked {
    public static DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {
        if(head == null)
            return head;
    DoublyLinkedNode temp = head;
    int count = 0;
    while (count < pos-1) {
        count++;
        temp = temp.next;
    }

    temp.next = temp.next.prev;

    return head;
    }

    public static void main(String args[]) {
        
    }
}
