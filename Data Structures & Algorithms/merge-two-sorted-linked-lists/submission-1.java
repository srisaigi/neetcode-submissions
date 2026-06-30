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
        List<Integer> a= new ArrayList<>();
        ListNode curr = list1;
        while(curr != null){
            a.add(curr.val);
            curr = curr.next;
        }
        curr = list2;
        while(curr != null){
            a.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(a);
        ListNode dummy = new ListNode(0);
        curr = dummy; 
        for(int i=0;i<a.size();i++){
            curr.next = new ListNode(a.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}