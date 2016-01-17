package Greedy.Mice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
	
	public int mice(ArrayList<Integer> a, ArrayList<Integer> b){
		int time = 0;
		Collections.sort(a);
		Collections.sort(b);
		for(int i=0; i<b.size(); i++){
			time = Math.max(Math.abs(b.get(i)-a.get(i)), time);
		}
		return time;
	}
	
}
