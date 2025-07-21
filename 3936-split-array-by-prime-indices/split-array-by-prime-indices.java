class Solution {
    public long splitArray(int[] nums) {
          boolean p[]=new boolean[nums.length+1];
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i<=Math.sqrt(nums.length);i++){
            if(p[i]){
                for(int j=i*i;j<=nums.length;j=j+i){
                    p[j]=false;
                }
            }
        }
        long pa =0, np =0;
        for(int i = 0 ;i < p.length -1;i++){
            if(p[i])pa+=nums[i];
            else np+=nums[i];
        }
        return Math.abs(pa-np);
    }
}