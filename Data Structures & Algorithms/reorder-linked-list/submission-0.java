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
        if(head == null || head.next == null){
            return;
        }
        ListNode curr = head;
        List<Integer> a = new ArrayList<>();
        while(curr != null){
            a.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        int l =0;
        int r = a.size() - 1;
        while(l <= r){
            curr.val = a.get(l);
            curr = curr.next;
            l++;
            if(l <= r){
            curr.val = a.get(r);
            curr = curr.next;
            r--;
            }
        }
    }
}
