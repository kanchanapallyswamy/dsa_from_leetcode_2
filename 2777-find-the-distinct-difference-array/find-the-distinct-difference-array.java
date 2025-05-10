class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int prefix[] = new int[nums.length];
        int sufix[] = new int[nums.length];
        Set< Integer > st = new HashSet<>();
        prefix[0] = 1;
        st.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            st.add(nums[i]);
            prefix[i] = st.size();
        }
        st = new HashSet<>();
        st.add(nums[nums.length-1]);
        for(int i = nums.length - 2; i >= 0; i--){
            sufix[i] = st.size();
            st.add(nums[i]);
        }
        int ans[] =new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = prefix[i] - sufix[i];
        }
        return ans;

    }
}