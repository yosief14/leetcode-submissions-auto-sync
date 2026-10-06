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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode reversedHead = new ListNode(head.val, null);
        ListNode prev = reversedHead;
        head= head.next;
        while(head != null){
           reversedHead = new ListNode(head.val, prev);
           prev = reversedHead;
           head = head.next;
        }

        return(reversedHead);
    }
}

