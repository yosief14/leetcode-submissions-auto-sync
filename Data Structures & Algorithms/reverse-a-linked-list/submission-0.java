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

/*
revHead = (0, null)
head = 1, head.next
temp = reversedHead;
reversedHead = (1, temp)

next = 1


head (1, pointer to 2)
new LinkedNode(1,0)

revHead = new ListNode(head.1)

 = 0
0   1   2   3 
->  ->  -> ->


tail = 
newListnode 
prev node 
while ListNode.next()!= null
    

*/