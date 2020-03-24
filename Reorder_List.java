/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

        if(head == null){
            return;
        }

        List<Integer> list = new ArrayList<>();
        List<Integer> reorder_list = new ArrayList<>();
        ListNode ls = head;
        ListNode reorder = null;


        while(ls != null){
            list.add(ls.val);
            ls = ls.next;
        }

        int middle = 0;

        if(list.size() % 2 == 0){
            middle = list.size() / 2;
            for(int i=0; i<=middle-1; i++){
                reorder_list.add(list.get(i));
                reorder_list.add(list.get((list.size()-1)-i));
            }
        }else{
            middle = list.size() / 2;
            for(int i=0; i<=middle-1; i++){
                reorder_list.add(list.get(i));
                reorder_list.add(list.get((list.size()-1)-i));
            }
            reorder_list.add(list.get(middle));
        }

        reorder = new ListNode(reorder_list.get(0));

        ListNode llist = null;
        llist = reorder;

        for(int i=1; i<reorder_list.size(); i++){
            reorder.next = new ListNode(reorder_list.get(i));
            reorder = reorder.next;
        }

        while(llist != null && head != null){
            head.val = llist.val;
            head = head.next;
            llist = llist.next;
        }

    }
}
/***

Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You may not modify the values in the list's nodes, only nodes itself may be changed.

Example 1:

Given 1->2->3->4, reorder it to 1->4->2->3.
Example 2:

Given 1->2->3->4->5, reorder it to 1->5->2->4->3.

***/
