package TwoPointer.Container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	public int maxArea(ArrayList<Integer> a) {
		int area = 0;
		
		int len = a.size();
		for(int i=0; i<len-1; i++){
			for(int j=i+1; j<len; j++){
				int base = j-i;
				int height = Math.min(a.get(i), a.get(j));
				if(height*base>area){
					area = height*base;
				}
			}
		}
		
		
		return area;
	}
	
	
}
