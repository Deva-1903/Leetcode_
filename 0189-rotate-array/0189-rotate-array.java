class Solution {
    public void rotate(int[] nums, int k) {
        // for eg: arr = [1,2,3,4,5] k=2, Now reverse the array. It becomes [5,4,3,2,1]
        // Now split into two parts based on k value. like [5,4,] and [3,2,1]
        // Now reverse the both parts.
        
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
