package Greedy.Candy;

import java.util.ArrayList;

public class Solution {
	public int candy(ArrayList<Integer> ratings) {
		int answer = 0;
		int len = ratings.size();
		if(len==1){
			return 1;
		}
		int[] candies = new int[len];
		candies[0] = 1;
		for(int i=1; i<len; i++){
			if(ratings.get(i)>ratings.get(i-1)){
				candies[i]=candies[i-1]+1;
			}
			else if(ratings.get(i)<=ratings.get(i-1)){
				candies[i]=1;
			}
		}
			
		for(int i = len-2; i>=0; i--){
			if(ratings.get(i)>ratings.get(i+1)){
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
