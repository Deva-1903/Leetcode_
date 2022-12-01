class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool = new ArrayList<Boolean>();
        
        int[] arr = new int[candies.length];
        int smallNum = -1;
        
        
        for(int i=0; i<candies.length; i++){
            if(candies[i]>smallNum){
                smallNum = candies[i];
             
            }
        }
        for(int i=0; i<candies.length; i++){
            if(((candies[i]+extraCandies) >= smallNum)){
                bool.add(true);
            }else{
                bool.add(false);
            }
        }
        return bool;
    }
}