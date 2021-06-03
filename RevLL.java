import java.util.Stack; 

class Solution {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
        public ListNode reverseList(ListNode head) {
            if (head == null) return head; 
            
            ListNode curr = head; 
            Stack<ListNode> stack = new Stack<ListNode>();
            
            while (curr != null) {
                stack.push(curr); 
                curr = curr.next; 
            }
            
            ListNode new_head = stack.peek(); 
            curr = new_head; 
            while (!stack.isEmpty()) {
                stack.pop();
                
                if (stack.isEmpty()) {
                curr.next = null; 
                break; 
                }
                
                curr.next = stack.peek();
                curr = curr.next; 
            }
            
            return new_head; 
        }
}