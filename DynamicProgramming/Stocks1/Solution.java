package DynamicProgramming.Stocks1;

import java.util.ArrayList;

public class Solution {
	public int maxProfit(ArrayList<Integer> a) {
		int answer = Integer.MIN_VALUE;
		int len = a.size();
		if(len==0){
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<len; i++){
			int val = a.get(i);
			max = val;
			if(val<min){
				min = val;
			}
			answer = Math.max(answer, max-min);
		}
		return answer;
	}
}
