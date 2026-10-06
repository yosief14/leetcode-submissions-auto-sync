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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempHead = new ListNode(0);
        ListNode cur = tempHead;
       while( list2!= null && list1!= null){
        if ( list1.val < list2.val){
            cur.next = list1;
            list1 = list1.next;
        }else {
            cur.next = list2; 
            list2 = list2.next;
        }
            cur = cur.next;
       }
       
       if(list1 != null){
        cur.next = list1;
       }else{
        cur.next = list2;
       }
       return tempHead.next;
       
    }
}

/*
while list1 != null and list2 != null

compare cur 1 and cur 2

have smaller point to larger
update smaller to next
   x
[1,4] [2,3]

1-> 2
cur1 = cur1.next

curr1 = 4 > curr2 = 2

curr2 = 3

4,3

cur1


*/