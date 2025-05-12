class Solution {
    public int findNumbers(int[] nums) {
        int cnt  = 0;
        for(var i : nums){
            int len = (int)Math.log10(i) + 1;
            if(len % 2 == 0)cnt++;
        }
        return cnt;
    }
}