class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int indx = 0;
        for(int i=0; i<n; i++){
            arr[indx] = nums[i];
            arr[indx+1] = nums[n+i];
            indx++;
            indx++;
        }
        return arr;
    }
}