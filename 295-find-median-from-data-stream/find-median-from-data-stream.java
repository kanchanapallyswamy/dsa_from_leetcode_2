class MedianFinder {
        Queue<Integer> minpq= new PriorityQueue<>();
        Queue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
 
    
    public void addNum(int num) {
        if(maxpq.size()==0 ){
            maxpq.add(num);
        }
        else if(num<=maxpq.peek()){
            maxpq.add(num);
        }
        else{
            minpq.add(num);
        }
        

        // 2.Balancing 

        int s1=maxpq.size();
        int s2=minpq.size();
        int diff=s1-s2;
        if(diff==2){
          minpq.add(maxpq.remove());
            }
        else if(diff == -1){
                maxpq.add(minpq.remove());
        }

        
    }
    
    public double findMedian() {
        if( maxpq.size()  == minpq.size() ) {
            return (maxpq.peek()+minpq.peek())/2.0;
        }
        else{
            return (double)maxpq.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */