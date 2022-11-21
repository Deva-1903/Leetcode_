class Solution {
    public void rotate(int[] nums, int k) {
        // step1: reverse the array
        // step2: split the array into two.
        // step3: reverse both the two parts.
        
        //taking k modulo for edge cases
        k = k%nums.length;
        swap(nums, 0, nums.length-1);
        swap(nums, 0, k-1);
        swap(nums, k, nums.length-1);
    }
    public void swap(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
