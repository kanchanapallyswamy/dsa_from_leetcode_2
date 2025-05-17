class Solution {
    public void sortColors(int[] nums) {
        int cnt_z = 0, cnt_o = 0, cnt_t = 0;
        for(var i : nums){
            if(i == 0)cnt_z++;
            else if(i == 1)cnt_o++;
            else cnt_t++;
        }
        for(int i = 0; i < nums.length; i++){
            if(cnt_z != 0){
                nums[i] = 0;
                cnt_z--;
            }
            else if(cnt_o != 0 ){
                nums[i] = 1;
                cnt_o--;                
            }
            else{
                nums[i] = 2;
                cnt_t--;
            }
        }
    }
}