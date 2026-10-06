/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Node copy = new Node(0); 
       Node start = copy; 
       Node headStar = head;
       HashMap<Node, Node> list = new HashMap<>(); 
       while(head!=null){
        copy.next = new Node(head.val);
        copy = copy.next;
        list.put(head, copy);
        head = head.next;
       }
       copy = start.next; 
       head = headStar;
       
       while(head!=null){
        copy.random = list.get(head.random);
        copy = copy.next;
        head = head.next;
       }
    //    list.forEach((k, v) -> System.out.println(" key: " + (k != null ?k.val : k) + " val:"+v.val));

       return start.next;
       
       
    }
}


/*
how do i copy over values stored in next pointer and random pointer

iterate through linked List

random points to a random node containing val, next and another random pointer


how do i point to already created nodes


random = ->2

I need to associate new nodes to old nodes


random = pointer to old 3 
old 3, new 3

*/