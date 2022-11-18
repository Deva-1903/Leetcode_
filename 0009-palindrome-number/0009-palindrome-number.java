class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int num = 0;
        int temp = x;
        while(x>0){
            num = x%10;
            reverse = (reverse*10) + num;
            x = x/10;
        }
        if(temp==reverse){
            return true;
        }
        return false;
    }
}