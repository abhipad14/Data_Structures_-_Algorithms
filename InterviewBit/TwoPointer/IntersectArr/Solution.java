package TwoPointer.IntersectArr;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> intersect(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int len1 = a.size();
		int len2 = b.size();
		int i = 0, j=0; 
		while(i<len1 && j<len2){
			int one  = a.get(i);
			int two = b.get(j);
			if(one == two){
				answer.add(one);
				i++;
				j++;
			}
			else if(one<two){
				i++;
			}
			else{
				j++;
			}
		}
		return answer;
		
	}
}
