class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { 
        int m1 = 0;
        int m2 = 0; 
        for(int i=0; i<nums.length; i++){    
            if(nums[i]==1){
                m1++;    
            }if(m2<m1){
                m2 = m1;
            }
            m1 = (nums[i]==0) ? 0 : m1;
        }
        return m2;
    }
}