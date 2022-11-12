class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum = 0;
        int[] newArr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            newArr[i] = sum;
        }
        return newArr;
    }
}