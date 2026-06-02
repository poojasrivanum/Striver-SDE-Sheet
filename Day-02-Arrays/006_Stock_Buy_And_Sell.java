/*
Leetcode 121 - Best Time to Buy and Sell Stock

Approach:
1. Keep track of minimum price seen so far.
2. Calculate profit for current day.
3. Update maximum profit.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        Solution obj = new Solution();

        int ans = obj.maxProfit(prices);

        System.out.println(ans);
    }
}