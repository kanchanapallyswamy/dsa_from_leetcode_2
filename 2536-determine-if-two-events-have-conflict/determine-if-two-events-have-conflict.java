class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1 = parse(event1[0]);
        int end1 = parse(event1[1]);
        int start2 = parse(event2[0]);
        int end2 = parse(event2[1]);
        
        return !(end1 < start2 || end2 < start1);
    }
    
    private int parse(String time) {
        return Integer.parseInt(time.substring(0,2) + time.substring(3,5));
    }
}
