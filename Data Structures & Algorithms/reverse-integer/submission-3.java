class Solution {
    public int reverse(int x) {
        int a = Math.abs(x); // Magic starts here...for implementational......
        int sum =0;
        while(a > 0){
            int rem = a % 10;
            if(sum > (Integer.MAX_VALUE - rem)/10){
                return 0;
            }
            sum = sum * 10 + rem;
            a = a / 10;
        }
        return (x > 0) ? sum : -sum;
    }
}
