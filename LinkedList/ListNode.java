package LinkedList;


public class ListNode {

     ListNode next;
     int data;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    // Traversing the linked list
   static public  int ListLength(ListNode headNode)
    {
        int length=0;
        ListNode currentNode=headNode;
        while(currentNode!=null)
        {
            System.out.println(currentNode.getData());
            length++;
            currentNode=currentNode.getNext();
        }
        return length;
    }


}
