class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return find(nums, upper) - find(nums, lower -1);
    }
    long find(int nums[], int target){
        long ans = 0;
        int j = nums.length - 1;
        for(int i = 0; i < j; i++){
            while(i < j && nums[i] + nums[j] > target) j--;
            ans += j - i;
        }
        return ans;
    }
}