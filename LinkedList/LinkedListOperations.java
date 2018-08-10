package LinkedList;


public class LinkedListOperations {

   static ListNode head;

   // insertion

 static public void insertAtStart(int val)
   {


    ListNode listNode=new ListNode(val);
    listNode.setNext(head);
    head=listNode;
   }
    static public void insertAtEnd(int val) {
        ListNode currentNode = head;

        while (currentNode.getNext() != null)
          currentNode=  currentNode.getNext();
        ListNode toAppend = new ListNode(val);
        currentNode.setNext(toAppend);

         }

    static public void insertAtPosition(int val,int position) {
        ListNode currentNode = head;

        for(int i=1;i<position;i++)
            currentNode=  currentNode.getNext();
        ListNode toAppend = new ListNode(val);
        toAppend.setNext(currentNode.getNext());
        currentNode.setNext(toAppend);

    }

    // deletion

    static public void deleteAtBegin() {
        ListNode temp = head;
        head=head.next;
      //  temp.next=null;

           }

  static   void deleteNode(int position)
    {
        // If linked list is empty
        if (head == null)
            return;

        // Store head node
        ListNode temp = head;

        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        // If position is more than number of ndoes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        ListNode next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }



// Reverse List
static public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
    return prev;
}

// merge two list
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.data < l2.data){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

  static   void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public  static void main(String args[])
    {
        insertAtStart(5);
        insertAtStart(10);
        insertAtStart(6);
//        insertAtEnd(5);
//        insertAtEnd(30);
//       insertAtPosition(200,1);
       // deleteAtBegin();
       // deleteAtBegin();
   //     deleteNode(0);
        printList(head);

      head= reverse(head);
       printList(head);

    }


}
