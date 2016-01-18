package DynamicProgramming.Jump1;

import java.util.ArrayList;

public class Solution {
	
	public int canJump(ArrayList<Integer> a){
		int min = 0, max = 0;
		int len = a.size();
		if(len==1) return 1;
		for(int i=0; i<len; i++){
			if(i>=min  &&  i<=max){
				if(i==0){
					min = i+1;
					max = i+a.get(i);
				}
				else{
					if(i+a.get(i)>max){
						max = i+a.get(i);
					}
					if(max>=len-1){
						return 1;
					}
				}
			}
			else{
				return 0;
			}
		}
		return 0;
	}
}
