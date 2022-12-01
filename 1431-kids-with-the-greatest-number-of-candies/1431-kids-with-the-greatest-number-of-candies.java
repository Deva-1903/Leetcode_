class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool = new ArrayList<Boolean>();
        int maxNum = -1;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>maxNum) maxNum = candies[i];       
        }
        for(int i=0; i<candies.length; i++){
            bool.add(candies[i]+extraCandies >= maxNum);
        }
        return bool;
    }
}