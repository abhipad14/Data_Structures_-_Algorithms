package TwoPointer.Merge;

import java.util.ArrayList;

public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int len1 = a.size();
		int len2 = b.size();
		
		int i=0, j=0;
		
		while(i<len1 && j<len2){
			len1 = a.size();
			int one = a.get(i);
			int two = b.get(j);
			if(one == two){
				a.add(i+1, two);
				i+=2;
				j++;
			}
			else if(one<two){
				i++;
			}
			else{
				a.add(i, two);
				
				j++;
			}

		}
		
		if(i==len1){
			while(j<len2){
				a.add(b.get(j++));
			}
		}
	}
}
