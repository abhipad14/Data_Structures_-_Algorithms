package DynamicProgramming.Stocks2;

import java.util.ArrayList;

public class Solution {
	public int maxProfit(ArrayList<Integer> a) {
		int answer = 0;
		int len = a.size();
		int min=0, max=0;
		for(int i=0; i<len; i++){
			if(i==0){
				min = a.get(i);
				max = a.get(i);
			}
			else{
				if(a.get(i)>=max){
					max = a.get(i);
				}
				else{
					answer += max-min;
					min = a.get(i);
					max = a.get(i);
				}
			}
		}
		answer += max-min;
		return answer;
	}
}
