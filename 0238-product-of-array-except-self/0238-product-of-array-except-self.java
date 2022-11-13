class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        
        int[] arr = new int[nums.length];
        
        int rp = 1;
        
        //left pass
        for(int i=0; i<nums.length; i++){ 
            arr[i] = rp;
            rp = rp*nums[i];
        }
        
        //right pass
        rp = 1;
        for(int i=nums.length-1; i>=0; i--){
            arr[i] = arr[i]*rp;
            rp = rp*nums[i];
        }
        return arr;
    }
}