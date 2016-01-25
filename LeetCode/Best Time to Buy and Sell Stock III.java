/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/


public class Solution {
    public int maxProfit(int[] a) {
        int len = a.length;
        if(len==0) return 0;
        int k = 2;
        int[][] profit = new int[k+1][len];
        for(int i=0; i<=k; i++){
            profit[i][0] = 0;
        }
        for(int i=0; i<len; i++){
            profit[0][i] = 0;
        }
        int diff = Integer.MIN_VALUE;
        for(int i=1; i<=k; i++){
            diff = -a[0];
            for(int j=1; j<len; j++){
                profit[i][j] = Math.max(profit[i][j-1], a[j]+diff);
                diff = Math.max(diff, profit[i-1][j] - a[j]);
            }
        }
        return profit[k][len-1];
    }
}
}