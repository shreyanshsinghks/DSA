package com.Arrays_13;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(sellStocks(prices));
    }

    private static int sellStocks(int[] arr) {
        int buyPrice = arr[0];
        int maxProfit = 0;
        for(int i = 1; i < arr.length; i++){
            int currPrice = arr[i];
            if(currPrice > buyPrice){
                int profit = currPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = currPrice;
            }
        }
        return maxProfit;
    }

}
