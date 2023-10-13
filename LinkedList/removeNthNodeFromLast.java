package DSA-Sheet.LinkedList;
public class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class removeNthNodeFromLast {
    public static ListNode removeNthNode(ListNode head, int n) {
        ListNode curr = head;
        ListNode temp = head;
           int len = 0;
        while(temp != null) {
            temp = temp.next;
            len++;
        }
   
       if((len-n+1) == 1) {
           return head.next;
       }
        for(int i=1;i<len-n;i++) {
            curr = curr.next;
        }
        ListNode prev = curr.next.next;
        curr.next = prev;
        return head;
       }
}
