package TwoPointer.Remelm;

import java.util.ArrayList;

public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
		int answer  = a.size();
		int len = answer;
		int count = 0;
		for(int i=0; i<len; i++){
			if(a.get(i)==b){
				count++;
			}
			else{
				a.set(i-count, a.get(i));
			}
		}
		
		for(int i=0; i<count; i++){
			a.remove(a.size()-1);
		}
		answer = a.size();
		return answer;
	}
}
