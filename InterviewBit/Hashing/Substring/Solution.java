package Hashing.Substring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	public ArrayList<Integer> findSubstring(String a, ArrayList<String> b) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<String, Integer> set = new HashMap<>();
		int lsub = b.size();
		for(int i=0; i<lsub; i++){
			if(set.containsKey(b.get(i))){
				int value = set.get(b.get(i));
				value++;
				set.replace(b.get(i), value);
			}
			else{
				set.put(b.get(i), 1);
			}
		}
		HashMap<String, Integer> copy = new HashMap<>();
		copy = (HashMap<String, Integer>) set.clone();
		int i=0;
		lsub = b.get(0).length()*lsub;
		int minlen = b.get(0).length();
		int len = a.length();
		int start=0;
		boolean flag = true;
		while(i<len){
			if(i+minlen >len){
				i++;
				continue;
			}
			String temp = a.substring(i, i+minlen);
			if(copy.containsKey(temp)){
				if(flag){
					start = i;
					flag = false;
				}
				int value = copy.get(temp);
				value--;
				if(value==0){
					copy.remove(temp);
				}
				else{
					copy.replace(temp, value);
				}
				i = i+minlen;
			}
			else{
				i = start;
				flag = true;
				i++;
				start = i;
				copy = (HashMap<String, Integer>) set.clone();
			}
			if(copy.isEmpty()){
				i = start;
				flag = true;
				i++;
				answer.add(start);
				copy = (HashMap<String, Integer>) set.clone();
			}
		}
		return answer;
	}
}
