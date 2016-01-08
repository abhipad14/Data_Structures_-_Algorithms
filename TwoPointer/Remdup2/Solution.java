package TwoPointer.Remdup2;

import java.util.ArrayList;

public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
		int index = 1;
	    int count = 1;
	    int n = a.size();
	    
	    for (int i = 1; i < n; i++) {
	        if (a.get(i).intValue() == a.get(i - 1).intValue() && count < 2) {
	            a.set(index, a.get(i));
	            count++;
	            index++;
	        } else if (a.get(i).intValue() != a.get(i - 1).intValue()) {
	            a.set(index, a.get(i));
	            count = 1;
	            index++;
	        }
	    }
	    
	    
	    return index;
	}
}

