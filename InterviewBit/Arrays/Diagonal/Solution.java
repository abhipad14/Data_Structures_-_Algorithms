package Arrays.Arrays_Diagonal;

import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		int n= a.size();
		for(int i=0; i<n; i++){
			ArrayList<Integer> temp = new ArrayList<>();
			int index = i;
			for(int j=0; j<=i; j++){
				temp.add(a.get(j).get(index--));
			}
			answer.add(temp);
		}
		for(int i=1; i<n; i++){
			ArrayList<Integer> temp = new ArrayList<>();
			int index =n-1;
			for(int j=0; j<n-i; j++){
				
				temp.add(a.get(j+i).get(index--));
			}
			answer.add(temp);
		}
		return answer;
	}
}
