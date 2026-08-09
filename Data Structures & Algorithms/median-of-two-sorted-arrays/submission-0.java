class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         PriorityQueue<Integer> left = new PriorityQueue<>((a,b) -> b - a);
        PriorityQueue<Integer> right  = new PriorityQueue<>((a,b) -> a - b);
        for(int num : nums1){
             if(left.isEmpty() || left.size() < right.size()){
            left.add(num);
       }
       else{
        right.add(num);
       }
       if(left.size()< right.size()+1){
            left.add(right.poll());
       }
       if(left.size() > right.size() + 1){
            right.add(left.poll());
       }
        }
        for(int num : nums2){
             if(left.isEmpty() || left.size() < right.size()){
            left.add(num);
       }
       else{
        right.add(num);
       }
       if(left.size()< right.size()+1){
            left.add(right.poll());
       }
       if(left.size() > right.size() + 1){
            right.add(left.poll());
       }
        }
        double res = 0.0;
         if(left.size() == right.size()){
            res = (left.peek() + right.peek()) / 2.0;
        }
        else{
            res = left.peek();
        }
        return res;
    }
}
