package DynamicProgramming.Jump2;

import java.util.ArrayList;

public class Solution {
	
	public int jump(ArrayList<Integer> a) {
	    if(a.size()<=1) return 0;
		int len = a.size(), step = 0;
		if(canJump(a)==0) return -1;
	    for (int i = 0; i < len; i++) {
	        if (i + a.get(i) >= len - 1) {
	            step++;
	            return step;
	        }
	        int max = -1, position = i + 1;
	        for (int j = i + 1; j <= i + a.get(i); j++) {
	            if (j - i + a.get(j) > max) {
	                max = j - i + a.get(j);
	                position = j;
	            }
	        }
	        i = position - 1;
	        step++;
	    }
	    return 0;
	}
	
	
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
