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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode node : lists){
            pq.add(node);
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            tail.next = curr;
            tail = tail.next; 
            if(curr.next != null){
                pq.add(curr.next);
            }
        }
        return head.next;
    }
}
