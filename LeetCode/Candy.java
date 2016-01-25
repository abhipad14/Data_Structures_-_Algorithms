/*
There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?
*/



public class Solution {
    public int candy(int[] ratings) {
        int answer = 0;
		int len = ratings.length;
		if(len==1){
			return 1;
		}
		int[] candies = new int[len];
		candies[0] = 1;
		for(int i=1; i<len; i++){
			if(ratings[i]>ratings[i-1]){
				candies[i]=candies[i-1]+1;
			}
			else if(ratings[i]<=ratings[i]){
				candies[i]=1;
			}
		}
			
		for(int i = len-2; i>=0; i--){
			if(ratings[i]>ratings[i+1]){
				if(candies[i]<candies[i+1]+1){
					candies[i] = candies[i+1]+1;
				}
			}
		}
		for(int i=0; i<len; i++){
			answer += candies[i];
		}
		return answer;
    }
}