package BackTracking.Permutations;

import java.util.ArrayList;

public class Solution {
	ArrayList<ArrayList<Integer>> answer;
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		answer = new ArrayList<>();
		answer = permu(a, answer);
		return answer;
	}

	public ArrayList<ArrayList<Integer>> permu(ArrayList<Integer> num, ArrayList<ArrayList<Integer>> allper){
		if(num.size()>0){
			ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
			if(num.size()==1){
				ArrayList<Integer> temp2 = new ArrayList<>();
				temp2.add(num.get(0));
				temp.add(temp2);
				return temp;
			}
			else{
				for(int i=0; i<num.size(); i++){
					int val = num.get(i);
					ArrayList<Integer> temp2 = new ArrayList<>();
					for(int j=0; j<num.size(); j++){
						if(i!=j){
							temp2.add(num.get(j));
						}
					}
					allper = permu(temp2, allper);
					for(ArrayList<Integer> l: allper){
						ArrayList<Integer> dummy = new ArrayList<>();
						dummy.add(val);
						dummy.addAll(l);
						temp.add(dummy);
					}
				}
				return temp;
			}
		}
		else{
			return allper;
		}
	}
}
