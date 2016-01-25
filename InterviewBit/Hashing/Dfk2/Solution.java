package Hashing.Dfk2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	public int diffPossible(ArrayList<Integer> a, int b) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int len = a.size();
		for(int i=0; i<len; i++){
		    map.put(a.get(i), i);
		}
		for(int i=0; i<len; i++){
		    int diff = a.get(i)-b;
		    if(map.containsKey(diff)){
		        if(map.get(diff)!=i){
		            answer = 1;
		            break;
		        }
		    }
		}
		return answer;
	}
}
