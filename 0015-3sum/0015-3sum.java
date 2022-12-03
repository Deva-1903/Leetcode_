class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> arr = new ArrayList<List<Integer>>();
     Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;            
            int start = i+1; 
            int end = nums.length-1;
            int sum = 0;
            while(start<end){
                sum = nums[i] + nums[start] + nums[end];                
                if(sum>0){
                     end -=1;
                }  
                else if(sum<0){
                      start += 1;
                } 
                else{
                    arr.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[start],nums[end])));
                    start += 1;
                    while(nums[start] == nums[start-1] && start<end){
                        start +=1;
                    }
                }   
            }
        }
        return arr;
    }
}