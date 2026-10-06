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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while (true) {
            // get Kth
            ListNode kth = getKth(groupPrev, k);
            if (kth == null) {
                break;
            };

            // store the start of the next group 
            ListNode groupNext =kth.next; // 4
            // since it will be reveresed the prev = kth.next
            ListNode prev = kth.next; // 5
            ListNode curr = groupPrev.next;//1
            // means we have reached 4 or the start of the next group
            while(curr != groupNext){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = groupPrev.next; //1
            System.out.println(temp.val);
            groupPrev.next = kth; // 1 -> 4
            groupPrev = temp; 
            }
            return dummy.next;
    }
    private ListNode getKth(ListNode cur, int k) {
        while (cur != null && k > 0) {
            cur = cur.next;
            k--;
        }
        return cur;
    }
}
