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
    //     ListNode curr1 = l1;
    //     List<Integer> a1 = new ArrayList<>();
    //     List<Integer> a2 = new ArrayList<>();
    //     while(curr1 != null){
    //        a1.add(curr1.val);
    //         curr1 = curr1.next;
    //     }
    //     ListNode curr2  = l2;
    //     while(curr2 != null){
    //         a2.add(curr2.val);
    //         curr2 = curr2.next;
    //     }
    //     check(a1);
    //     check(a2);
    //     int num1 = 0;
    //     int num2 =0;
    //     for(int num : a1){
    //         num1 = num1 * 10 + num;
    //     } 
    //     for(int num : a2){
    //         num2 = num2 * 10 + num;
    //     }
    //     int res = num1 + num2;
    //     ListNode dummy = new ListNode(0);
    //     ListNode curr = new ListNode(0);
    //     ListNode prev = null;
    //     curr = dummy.next;
    //     while(res > 0){
    //         int rem = res % 10;
    //         curr.val = rem;
    //         curr = curr.next;
    //         prev.next = curr;
    //         prev = curr;
    //     }
    //     return dummy.next;
    // }
    // private void check(List<Integer> a){
    //     int l =0;
    //     int r = a.size() - 1;
    //     while(l < r){
    //         int temp = a.get(l);
    //         a.set(l,a.get(r));
    //         a.set(r,temp);
    //         l++;
    //         r--;
    //     }
    ListNode dummy = new ListNode(0);

    ListNode curr = dummy;

    int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
        int sum = carry;

         if(l1 != null){

        sum += l1.val;

        l1 = l1.next;
    }

    if(l2 != null){

        sum += l2.val;

        l2 = l2.next;
    }

    carry = sum / 10;

    curr.next = new ListNode(sum % 10);

    curr = curr.next;
}

return dummy.next;
    }
}
