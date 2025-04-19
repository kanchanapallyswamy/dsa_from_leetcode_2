class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long c1 = 0, c2 = 0;
        int i = 0, j = nums.length - 1;
        while(i < j){
            if(nums[i] + nums[j] <= upper){
                c1 += j - i;
                i++;
            }
            else j--;
        }
        i = 0;
        j = nums.length - 1;
         while(i < j){
            if(nums[i] + nums[j] <= lower - 1){
                c2 += j - i;
                i++;
            }
            else j--;
        }
        return c1 - c2;

    }
}