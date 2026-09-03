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
        //1,2,3,4,5,6,7 n = 3, k= 7-3= 4
        // now prev stored , prev.next = null, curr-> next = null, node isolated
        //then prev.next = curr.next, 

        //size of the linked list
        ListNode curr = head;
        int count = 0;
        while(curr!= null){
            count++;
            curr = curr.next;
        }
        int index = count -n;
        // Edge case: removing head
        if (index == 0) {
            return head.next;
        }

        ListNode current = head;
        while(index>1){
            current= current.next;
            index--;
        }
       current.next = current.next.next;
       return head;
    }
}
