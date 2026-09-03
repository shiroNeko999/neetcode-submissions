/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*fixed gap = n + 1

fast reaches position L + 1

slow position
= (L + 1) - (n + 1)
= L - n*/

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0;i<=n;i++){
            fast = fast.next;
        } 
    // move both until fast recaches the null point
        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next; 
        return dummy.next;// removes the condition where we have index as head
    }
}
