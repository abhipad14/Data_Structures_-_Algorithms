package TwoPointer.Remdup;

import java.util.ArrayList;

public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
		int answer = a.size();
		int len = answer;
		if(len==0){
			return 0;
		}
		int count=0;
		int index = 1;
		int prev = a.get(0);
		for(int i=1; i<len; i++){
			if(a.get(i)==prev){
				count++;
			}
			else{
				prev = a.get(i);
				a.set(index, a.get(i));
				index++;
			}
		}
		for(int i=0; i<count; i++){
			a.remove(a.size()-1);
		}
		answer = a.size();
		return answer;
	}
}
