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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        List<Integer> a = new ArrayList<>();
        int count =0;
        while(curr != null){
            count++;
           a.add(curr.val);
            curr = curr.next;
        }
        int req = count / k;
        int rem = count % k;
        List<List<Integer>> b = new ArrayList<>();
        int temp1 =0;
        int i=0;
        while(i < req){
            List<Integer> a1 = new ArrayList<>();
            int temp2 =0;
            while(temp2 < k){
                a1.add(a.get(temp1));
                temp2++;
                temp1++;
            }
            b.add(new ArrayList<>(a1));
            i++;
        } 
        for(int j =0;j<req;j++){
            List<Integer> a2 = b.get(j);
            check(a2,0,k-1);
        }
        if(rem > 0){
            List<Integer> res = new ArrayList<>();
            while(rem > 0){
                res.add(a.get(temp1++));
                rem--;
            }
            b.add(new ArrayList<>(res));
        }
        List<Integer> ans = new ArrayList<>();
        for(List<Integer> c : b){
            for(int num : c){
                ans.add(num);
            }
        }
        curr = head;
        ListNode dummy = new ListNode(0);
        curr = dummy;
        for(int l=0;l<count;l++){
            curr.next = new ListNode(ans.get(l));
            curr = curr.next;
        }
        return dummy.next;
    }
    private void check(List<Integer> a,int l,int r){
        while(l < r){
        int temp = a.get(l);
        a.set(l,a.get(r));
        a.set(r,temp);
        l++;
        r--;
        }
    }
}
