class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        int sum =0;
        HashSet<Integer> hs = new HashSet<>();
        while(true){
            while(temp > 0){
                int rem = temp % 10;
                sum = sum + rem * rem;
                temp = temp / 10;
            }
            if(sum == 1){
                return true;
            }
            if(hs.contains(sum)){
                return false;
            }
            hs.add(sum);
            temp = sum;
            sum = 0;
        }
    }
}
