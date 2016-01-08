package Hashing.TwoSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
	public ArrayList<Integer> twoSum(ArrayList<Integer> a, int b) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int size = a.size();
		int index1=-1, index2 = -1;
		for(int i=0; i<size; i++){
			if(map.isEmpty()){
				map.put(a.get(i), i);
			}
			else{
				if(!map.containsKey(a.get(i))){
					map.put(a.get(i), i);
				}
			}
		}
		for(int i=0; i<size; i++){
			int diff = b - a.get(i);
			if(map.containsKey(diff)  &&  i!=map.get(diff)){
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(map.get(diff)+1);
				temp.add(i+1);
				Collections.sort(temp);
				if(answer.size()==0){
					answer=temp;
					continue;
				}
				if(answer.get(1)>=temp.get(1)){
					if(answer.get(1)==temp.get(1)){
						if(answer.get(0)>temp.get(0)){
							answer = temp;
						}
					}
					else{
						answer = temp;
					}
				}
			}
		}
		return answer;
	}
}
