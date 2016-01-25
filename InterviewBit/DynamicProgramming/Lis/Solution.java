package DynamicProgramming.Lis;

import java.util.ArrayList;

public class Solution {
	public int lis(ArrayList<Integer> a) {
		int answer = 0;
		int len = a.size();
		if(len==0) return 0;
		if(len==1) return 1;
		int[] count = new int[len];
		for(int i=0; i<len; i++){
			count[i]=1;
		}
		for(int i=1; i<len; i++){
			for(int j=0; j<i; j++){
				if(a.get(i)>a.get(j)){
					count[i] = Math.max(count[i], count[j]+1);
				}
			}
		}
		for(int i=0; i<len; i++){
			answer = Math.max(answer, count[i]);
		}
		return answer;
	}
}
