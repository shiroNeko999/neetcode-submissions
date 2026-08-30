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
    public boolean hasCycle(ListNode head) {
        ListNode fastBunuy = head;
        ListNode slowBunuy = head;

        while(fastBunuy != null && fastBunuy.next!=null){
        
            fastBunuy = fastBunuy.next.next;
            slowBunuy = slowBunuy.next;
            if(fastBunuy == slowBunuy){
                return true;
            }
        }  
        return false;
    }
}
