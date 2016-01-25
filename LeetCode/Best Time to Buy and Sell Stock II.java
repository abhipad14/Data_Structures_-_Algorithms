/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
		int len = prices.length;
		int min=0, max=0;
		for(int i=0; i<len; i++){
			if(i==0){
				min = prices[i];
				max = prices[i];
			}
			else{
				if(prices[i]>=max){
					max = prices[i];
				}
				else{
					answer += max-min;
					min = prices[i];
					max = prices[i];
				}
			}
		}
		answer += max-min;
		return answer;
    }
}
