/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        List<Integer> list = new ArrayList<>();
        ListNode node = head;

        while(node != null){
            list.add(node.val);
            node = node.next;
        }

        int chunk = list.size() / k;
        //int remainNode = list.size() % k;

        for(int i=0; i<chunk; i++){
            Collections.reverse(list.subList(i*k,(i*k)+k));
        }

        ListNode reverse_node  = new ListNode(list.get(0));

        ListNode r_node = reverse_node;

        for(int i=1; i<list.size(); i++){
            reverse_node.next = new ListNode(list.get(i));
            reverse_node = reverse_node.next;
        }
        //System.out.println(list);
        return r_node;
    }
}

/***

Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

Example:

Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5

***/
