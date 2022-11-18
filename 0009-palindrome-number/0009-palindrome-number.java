class Solution {
    public boolean isPalindrome(int x) {
        int num = 0;
        int originalNum = x;
        
         while (x > 0) {
             int rem = x % 10;
             x = x / 10;
             num = (num * 10) + rem;
         }
         return(originalNum==num); 
    }
}