class Solution {
    public void moveZeroes(int[] nums) {
        
        int z = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                z++;
            }else {
                if(z>0){
                    int t = nums[i-z];
                    nums[i-z] = nums[i];
                    nums[i] = t;
                }
            }
        }
        
    }
}