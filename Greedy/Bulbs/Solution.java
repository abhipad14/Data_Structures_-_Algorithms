package Greedy.Bulbs;

import java.util.ArrayList;

public class Solution {
	
	//Efficient Solution
	public int bulb(ArrayList<Integer> a){
		int answer = 0;
		int len = a.size();
		for(int i=0; i<len; i++){
			if(answer%2==0){
				if(a.get(i)==0)
					answer++;
			}
			else{
				if(a.get(i)==1)
					answer++;
			}
		}
		return answer;
	}
	
	//Moderately Efficient Solution
	public int bulbs(ArrayList<Integer> a) {
		int answer = 0;
		int len = a.size();
		int index=0;
		boolean flag = false, flag2 = true;
		for(int i=index; i<len; i++){
			flag = false;
			if(a.get(i)==0){
				answer++;
				for(int j=i; j<len; j++){
					if(a.get(j)==0){
						a.set(j, 1);
					}
					else{
						if(!flag){
							flag = true;
							flag2 = true;
						}
						a.set(j, 0);
						if(flag && flag2){
							index = j;
							flag2 = false;
						}
					}
				}
			}
			
		}
		return answer;
	}
}
