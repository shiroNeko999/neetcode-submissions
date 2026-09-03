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
    public void reorderList(ListNode head) { 
        
        // find the middle of the node
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next; 
        }

        // reverse the second half
        ListNode second = slow.next;
        ListNode prev = null;
         slow.next = null ; // break the list after 1-2-3-> null, //vvi
        while(second!= null){
            ListNode next = second.next; 
            second.next = prev;
            prev = second;
            second = next;
        }
        ListNode first = head;// the list is already split
         second = prev;  
        // now the merger, the most important part
        while(second!= null){
           ListNode temp1 = first.next; 
           ListNode temp2 = second.next;
           first.next = second;
           second.next = temp1;
           first = temp1;
           second = temp2;
        }

    }
}
