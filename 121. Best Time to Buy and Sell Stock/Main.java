class Solution {
    public int maxProfit(int[] prices) {
        int smallNum = Integer.MAX_VALUE;
        int oprofit = 0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++) {
            if (smallNum > prices[i]) {
                smallNum = prices[i];
            }

            pist = prices[i] - smallNum;
            if (oprofit < pist) {
                oprofit = pist;
            }
        }
        return oprofit;
    }
}