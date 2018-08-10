package LinkedList;



public class CheckPalindrome {

    public Boolean isListPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode temp = head;
        ListNode tempSecondHalf = null;
        int count =0;
    int length = 0;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        for(int i=0; i <count/2 ;i++) {
            slow = slow.next;
        }
        if(count%2 == 0)
       tempSecondHalf = reverseList(slow);
        else tempSecondHalf = reverseList(slow.next);

        temp = head;
        while (tempSecondHalf !=null) {
            if(temp.data == tempSecondHalf.data) {
                temp = temp.next;
                tempSecondHalf = tempSecondHalf.next;
                length++;
            }
            else return false;
        }

        if(length == count/2)
            return true;

        return false;
    }

    public ListNode reverseList(ListNode node) {

        ListNode current = node;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(1);
        //listNode.next.next.next = new ListNode(8);

        CheckPalindrome checkPalindrome = new CheckPalindrome();
        checkPalindrome.isListPalindrome(listNode);
    }
}
