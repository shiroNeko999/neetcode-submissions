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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    int sum = 0; int carry =0;
    while(l1!= null || l2!= null || carry!=0){
        int d1= 0; int d2= 0;
        if(l1!=null){
            d1 = l1.val;
            l1 = l1.next;
        }
        if(l2!= null){
            d2 = l2.val;
            l2 = l2.next;
        }
        System.out.println(d1+"->"+d2);

        sum = d1+ d2+ carry; //10

        int digit = sum%10;
        carry = sum/10;//1 2
        curr.next = new ListNode(digit);
        curr = curr.next;
    }
    return dummy.next;
    



    }

}
