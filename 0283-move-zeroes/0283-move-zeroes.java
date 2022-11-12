class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeros++;
            }else {
                if(zeros>0){
                    int t = nums[i-zeros];
                    nums[i-zeros] = nums[i];
                    nums[i] = t;
                }
            }
        }
        
    }
}