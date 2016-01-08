package TwoPointer.Maxone;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> maxone(ArrayList<Integer> a, int b) {
		ArrayList<Integer> zeroPos = new ArrayList<>();
	    ArrayList<Integer> res = new ArrayList<>();
	    if (a == null)
	        return res;
	    int n = a.size();
	    for (int i = 0; i < n ; i++) {
	        int num = a.get(i);
	        if (num == 0)
	            zeroPos.add(i);
	    }
	    if (b >= zeroPos.size()) {
	        for (int i = 0; i < n; i++)
	            res.add(i);
	        return res;
	    }
	    int i = 0;
	    int j = b;
	    int maxSize = 0;
	    int start, end;
	    start = 0;
	    while (j <= zeroPos.size()) {
	        if (j == zeroPos.size())
    	        end = n - 1;
    	    else
    	        end = zeroPos.get(j) - 1;
	        int size = end - start + 1;
	        if (size > maxSize) {
	            maxSize = size;
	            res.clear();
	            res.add(start);
	            res.add(end);
	        }   
	        if (j == zeroPos.size())
	            break;
	        start = zeroPos.get(i) + 1;
	        i++;
	        j++;
	    }
	    start = res.get(0);
	    end = res.get(1);
	    res.clear();
	    for (i = start; i <= end; i++)
	        res.add(i);
	    return res;
	}
}
