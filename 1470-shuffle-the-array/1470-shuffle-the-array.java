class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int indx = 0;
        for(int i=0; i<n; i++){
            arr[indx] = nums[i];
            arr[indx+1] = nums[n+i];
            indx += 2;
        }
        return arr;
    }
}