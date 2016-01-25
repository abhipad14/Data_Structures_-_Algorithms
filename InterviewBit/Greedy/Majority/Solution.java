package Greedy.Majority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	
	public int majorityElement(ArrayList<Integer> a){
		HashMap<Integer, Integer> map = new HashMap<>();
		int value=0;
		for(int i=0; i<a.size(); i++){
			if(map.containsKey(a.get(i))){
				int count = map.get(value);
				count++;
				map.put(value, count);
			}
			else{
				if(map.isEmpty()){
					map.put(a.get(i), 1);
					value = a.get(i);
				}
				else{
					int count = map.get(value);
					count--;
					if(count==0){
						map.remove(value);
					}
					else{
						map.put(value, count);
					}
				}
			}
		}
		return value;
	}
}
