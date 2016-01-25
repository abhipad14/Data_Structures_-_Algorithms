package Hashing.Equal;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	class node{
		int val;
		int left; 
		int right;
		public node(int val, int left, int right) {
			super();
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	public ArrayList<Integer> equal(ArrayList<Integer> a) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, node> set = new HashMap<>();
		int size = a.size();
		for(int i=0; i<size-1; i++){
			for(int j=i+1; j<size; j++){
				int sum = a.get(i)+a.get(j);
				if(set.containsKey(sum)){
					int k = set.get(sum).left;
					int l = set.get(sum).right;
					if(k!=i && k!=j  && l!=i && l!=j){
						ArrayList<Integer> temp = new ArrayList<>();
						temp.add(k);
						temp.add(l);
						temp.add(i);
						temp.add(j);
						if(answer.size()!=0){
							if(k<answer.get(0)){
								answer = temp;
							}
							else if(k==answer.get(0)){
								if(l<answer.get(1)){
									answer = temp;
								}
								else if(l==answer.get(1)){
									if(i<answer.get(2)){
										answer = temp;
									}
									else if(i==answer.get(2)){
										if(j<answer.get(3)){
											answer = temp;
										}
									}
								}
							}
						}
						else{
							answer.addAll(temp);
						}
					}
				}
				else{
					set.put(sum, new node(sum, i, j));
				}
			}
		}
		return answer;
    }
}
