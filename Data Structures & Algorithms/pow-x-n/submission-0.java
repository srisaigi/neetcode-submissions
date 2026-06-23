class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1.0;
        }
        if(n > 0){
            return check(x,n);
        }
        else{
            return 1 /  check(x,-(n));
        }
    }
    private double check(double num,int n){
            if(n == 0){
                return 1;
            }
        double half = check(num,n/2);
        if(n % 2 == 0){
            return half * half;
        }
        else{
            return half * half * num;
        }
    }
}
