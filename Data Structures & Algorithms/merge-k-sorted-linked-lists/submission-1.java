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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        ListNode head = dummy;
        while(head != null){
            int nodeIndex = -1;
            ListNode nextUp = null;    
            int min = Integer.MAX_VALUE;
        for(int i = 0; i < lists.length ; i++){
            if(lists[i]== null){
                continue;
            }
            
            if(lists[i].val <= min ){
                nextUp = lists[i];
                nodeIndex = i;
                min = lists[i].val;
            }
         }
            min = Integer.MAX_VALUE;
            head.next = nextUp;
            head = head.next;
            if(nodeIndex >-1){
                
            lists[nodeIndex] = lists[nodeIndex].next;
            }
        }
        return dummy.next;
    }
}
/*
how do i update the node?


need to iterate through [[3], [2], [1]]
prev = 3
3 = 3.next = null


2  3

how do i 
I want to first set head  to list[0]

how do i iterate through all nodes

if i use it increment it

how do i store the incremented pointer 

list[i] = list[i].next


iterat through all the 
return smallest one

cur
if node.val > cur.val 

how do i set the target node I should want to compare

for each List

track smallest 


*/