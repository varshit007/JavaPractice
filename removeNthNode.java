class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class removeNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      if (head == null) return head; 
      
      ListNode curr = head; 
      int length = 0; 
      while (curr != null) {
        curr = curr.next; 
        length++; 
      }
      if (length == n) return head.next; 
      
      curr = head; 
      for (int i = 0; i < length-n-1; i++) {
        curr = curr.next; 
      }
      curr.next = curr.next.next; 
      return head; 
    }
}