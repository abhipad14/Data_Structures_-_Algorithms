package Greedy.Maxp3;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	public int maxp3(ArrayList<Integer> a){
		int answer = 0;
		int max, smax, tmax;
		max = Integer.MIN_VALUE;
		smax = max;
		tmax = max;
		int min, smin;
		min = Integer.MAX_VALUE;
		smin = min;
		int len = a.size();
		for(int i=0; i<len; i++){
			if(a.get(i)>max){
				tmax = smax;
				smax = max;
				max = a.get(i);
			}
			else if(a.get(i)>smax){
				tmax = smax;
				smax = a.get(i);
			}
			else if(a.get(i)>tmax){
				tmax = a.get(i);
			}
		}
		for(int i=0; i<len; i++){
			if(a.get(i)<min){
				smin = min;
				min = a.get(i);
			}
			else if(a.get(i)<smin){
				smin = a.get(i);
			}
		}
		if(len>=5){
			answer = Math.max(max*smax*tmax, max*min*smin);
		}
		else{
			answer = max*smax*tmax;
		}
		return answer;
	}
		
}
