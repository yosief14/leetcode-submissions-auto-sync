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
        int length = 0, counter= 0;
        ListNode start = head;
        //need to store the pointer to the start of the listNode


        while(head != null){
            length ++;
            head = head.next;
        }

        ListNode prev = null;
        head = start;
        ListNode revHead = start;
        // head = start;

        while (revHead != null && counter < (length/2)){
            prev = revHead;
            revHead = revHead.next;
            counter++;
        }
        ListNode prevR = null; 
        // ListNode tempy = new  ListNode(8);
        // ListNode revStart = tempy;
        // tempy.next = new ListNode(6);
        while(revHead != null){
            ListNode temp = revHead.next;
            revHead.next = prevR;
            prevR = revHead;
            revHead = temp;
        }
        revHead = prevR;
        counter = 0;
        // System.out.println(revHead.val + " " + revHead.next.val + " " + revHead.next.next );
        // System.out.println(head.val + " " + head.next.val + " " + head.next.next );

        while(head != null || revHead != null){
            ListNode head_temp = head == null ? null : head.next;
            ListNode rev_temp = revHead == null ? null : revHead.next;

        // System.out.println(head.val + " <-head head.next -> " + head.next.val + " revHead-> " + revHead );
           if(revHead==null){
             head_temp = null;
           }
           head.next = revHead;
            head = head_temp;
            if(revHead != null){
                revHead.next = head;
            }
            revHead = rev_temp;
        }
        head = start;

        

    }
}

/*


[0, 1, 2, 3, 4, 5, 6]

temp = 5
4.next = 3
head.next = temp
prev = 4 

//wrong since  
1 -> shifted 1 to the right -> 2
2 -> shifted 2 to the right -> 4
3 -> shifted 3 to the right -> 6
4 -> shifted 1 to the right -> 5
6 -> shifted 2 to the right -> 1

counter = 0;


iterate once to get the end

how do i do this by spliting in have

[0, 1, 2, 3, 4, 5, 6]

 4.next 

if I have 2 refs one at end of list one at begining 

iterate once to get length

iterate again to reverse half

iterate onemore time to reorder list

*/