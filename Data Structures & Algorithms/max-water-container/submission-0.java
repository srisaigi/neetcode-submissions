class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int count =0;
        int max = Integer.MIN_VALUE;
        int l=0;
        int r = n - 1;
        while(l < r){
            int h = Math.min(heights[l],heights[r]);
            int d = r - l;
            max = Math.max(max,h * d);
            if(heights[l] < heights[r]){
                l++;
            } 
            else{
                r--;
            }
        }
        return max;
    }
}
