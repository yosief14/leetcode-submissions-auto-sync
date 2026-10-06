class Solution {
    public int maxProfit(int[] prices) {
        int r = 1;
        int l = 0;
        int min = Integer.MAX_VALUE;
        int max = -1;
        int maxProfit = 0;
       while(r < prices.length){
         int profit =   prices[r] - prices[l] ;
         maxProfit = Math.max(maxProfit, profit);
         if(prices[l] >= prices[r]){
            l = r;
         }
         r++;
       }
       return maxProfit;
    }
}

/*
Brute force is to check every one

if you buy at 10 you need to sell above 10
if the val at i > i+1 

iterate throug
*/
