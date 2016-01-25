package Math.Math_Arrange;

import java.util.ArrayList;

public class Solution {
	public void arrange(ArrayList<Integer> a) {
		int len = a.size();
		for(int i=0; i<len; i++){
			int temp = a.get(i)+(a.get(a.get(i))%len)*len;
			a.set(i, temp);
		}
		for(int i=0; i<len; i++){
			a.set(i, a.get(i)/len);
		}
		
	}
}
