package Hashing.Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(ArrayList<String> a) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		int len = a.size();
		ArrayList<String> b = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<len; i++){
			char[] arr = a.get(i).toCharArray();
			Arrays.sort(arr);
			b.add(new String(arr));
		}
		int count = 0;
		for(int i=0; i<len; i++){
			ArrayList<Integer> temp = new ArrayList<>();
			if(map.isEmpty()){
				map.put(b.get(i), count++);
				temp.add(i+1);
				answer.add(temp);
			}
			else{
				if(map.containsKey(b.get(i))){
					int index = map.get(b.get(i));
					temp = answer.get(index);
					temp.add(i+1);
					answer.set(index, temp);
				}
				else{
					map.put(b.get(i), count++);
					temp.add(i+1);
					answer.add(temp);
				}
			}
		}
		return answer;
	}
}
