package StacksNQueues.Rain;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public int trap(ArrayList<Integer> a) {
		int n = a.size();
	    int rightMax[], leftMax[];
	    int left, right;
	    int res = 0;
	    
	    rightMax = new int[n];
	    leftMax = new int[n];
	    
	    left = 0;
	    right = 0;
	    
	    for (int i = 0; i < n; i++) {
	        leftMax[i] = left;
	        if (left < a.get(i))
	            left = a.get(i);
	    }
	    
	    for (int i = n - 1; i >= 0; i--) {
	        rightMax[i] = right;
	        if (right < a.get(i))
	            right = a.get(i);
	    }
	    
	    for (int i = 0; i < n; i++) {
	        
	        res += Math.max(0, Math.min(leftMax[i], rightMax[i]) - a.get(i));
	        
	    }
	    
	    
	    return res;
	}

}
