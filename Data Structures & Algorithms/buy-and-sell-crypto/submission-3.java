class Solution {
    public int maxProfit(int[] prices) {
        int r = 0;
        int maxProfit = 0;
       for(int l = 1 ; l < prices.length ; l++){
         
         int profit =   prices[l] - prices[r] ;
        //  System.out.printf("l: %d, r: %d, price[l]: %d, price[r]: %d, profit: %d", l, r, prices[l], prices[r], profit);
         maxProfit = Math.max(maxProfit, profit);
         if(prices[r] > prices[l]){
            r = l;
         }
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
