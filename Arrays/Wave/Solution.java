package Arrays.Arrays_Wave;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
		int size  = a.size();
		Collections.sort(a);
		for(int i=0; i<size-1; i+=2){
			swap(i, i+1, a);
		}
		
		return a;
	}
	
	
	public void swap(int a, int b, ArrayList<Integer> c){
		int temp = c.get(a);
		c.set(a, c.get(b));
		c.set(b, temp);
	}
}
