class MedianFinder {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;
    public MedianFinder() {
        left = new PriorityQueue<>((a,b) -> b - a);
        right = new PriorityQueue<>((a,b) -> a - b);
    }
    
    public void addNum(int num) {
        if(left.isEmpty() || left.size() < right.size()){
            left.add(num);
        }
        else{
            right.add(num);
        }
        if(left.size() < right.size() + 1){
            left.add(right.poll());
        }
        if(left.size() < right.size()){
            left.add(right.poll());
        }
        if(left.size() > right.size() + 1){
            right.add(left.poll());
        }
    }
    
    public double findMedian() {
        if(left.size() == right.size()){
            return (left.peek() + right.peek()) / 2.0;
        }
        else{
            return left.peek();
        }
    }
}
