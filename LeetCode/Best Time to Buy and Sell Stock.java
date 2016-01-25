/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
*/


public class Solution {
    public int maxProfit(int[] prices) {
        int answer = Integer.MIN_VALUE;
		int len = prices.length;
		if(len==0){
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<len; i++){
			int val = prices[i];
			max = val;
			if(val<min){
				min = val;
			}
			answer = Math.max(answer, max-min);
		}
		return answer;
    }
}