package BackTracking.SubSet;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		answer.add(new ArrayList<>());
		Collections.sort(a);
		getSubset(answer, a, 0, a.size(), temp);
		return answer;
	}
	
	
	public void getSubset(ArrayList<ArrayList<Integer>> answer, ArrayList<Integer> a, int index, int len, ArrayList<Integer> temp){
		if(index<len){
			for(int j=index; j<len; j++){
				ArrayList<Integer> dummy = new ArrayList<>();
				dummy.addAll(temp);
				dummy.add(a.get(j));
				answer.add(dummy);
				getSubset(answer, a, j+1, len, dummy);
			}
		}
	}
}
