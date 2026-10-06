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
        ListNode prevL1 = l1, prevL2 = l2;

        int counterL1 = 0;
        int counterL2 = 0;
        while (l1 != null) {
            l1= l1.next;
            counterL1++;
        }
        while (l2 != null) {
            l2 = l2.next;
            counterL2++;
        }

        ListNode largerNums;
        ListNode smallerNums;
        if (counterL2 > counterL1) {
            largerNums = prevL2;
            smallerNums = prevL1;
        } else {
            largerNums = prevL1;
            smallerNums = prevL2;
        }

        ListNode returnVal = largerNums;
        int passThrough = 0;
        ListNode prevy = null;
        while (largerNums != null) {
            int numL1 = largerNums.val;
            int numL2 = smallerNums == null ? 0 : smallerNums.val;
            int sum = numL1 + numL2 + passThrough;

            passThrough = sum/10;
            largerNums.val = sum % 10;
            prevy = largerNums;
            largerNums = largerNums.next;
            smallerNums = smallerNums == null ? null : smallerNums.next;
        }

        ListNode prevRet = null;
        ListNode dummy = returnVal;
        // while (returnVal != null) {
        //     ListNode temp = returnVal.next;
        //     returnVal.next = prevRet;
        //     prevRet = returnVal;
        //     returnVal = temp;
        // }
        System.out.println(prevy);
        if ( passThrough > 0) {
            ListNode add = new ListNode(passThrough);
            prevy.next=add;
        }
        return returnVal;
    }
}

/*
1 *10^0
*10^1 + 2*10^0

I could iterate convert to array of strings, join , multiply, and convert back to array and create a
node for each item.

O(1) space

1 1 1
9 9 9

Need to reverse both nodes

node 1 + node 2

if < 10
new node (0)
increment next node

1 + 9 =10

new node%10
node.next.val++;

if node.next==null
10 + 1 = 11
save 1
create new node (1)
node.next = newNode (1);

9 9 9
  1 1
------
0 0 0

9,9,9,9,9,9,9
      9,9,9,9
          9 8      
*/