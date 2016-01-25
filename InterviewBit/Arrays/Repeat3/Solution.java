package Arrays.Arrays_Repeat3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Solution {
	public int repeatedNumber(ArrayList<Integer> A) {
		int num;
	    int n = A.size();
	    
	    Collections.sort(A);
	    
	    for (int i = 0; i < n;) {
	        int freq = 0;
	        num = A.get(i);
	        
	        while (i < n && A.get(i) == num) {
	            freq++;
	            i++;
	        }
	        
	        if (freq * 3 > n)
	            return num;
	        
	    }

	    return -1;   
		
	}
}
