package TwoPointer.Sortcolor;

import java.util.ArrayList;

public class Solution {
	public void sortColors(ArrayList<Integer> a) {
		int[] count = new int[3];
		int len = a.size();
		for(int i=0; i<len; i++){
			count[a.get(i)]++;
		}
		int index = 0;
		for(int i=0; i<3; i++){
			int counter = 0;
			while(counter<count[i]){
				a.set(index, i);
				index++;
				counter++;
			}
		}
	}
}
