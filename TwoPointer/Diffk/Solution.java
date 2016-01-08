package TwoPointer.Diffk;

import java.util.ArrayList;

public class Solution {
	public int diffPossible(ArrayList<Integer> a, int b) {
		int start, end;
	    int n = a.size();
	    int diff;
	    start = 0;
	    end = 1;
	    while (start <= end && end < n) { 
	        diff = a.get(end) - a.get(start);
	        if (diff == b && start != end) {
	            return 1;
	        } else if (diff <= b) {
	            end++;
	        } else {
	            start++;
	        }
	    }
	    return 0;
	}
}
