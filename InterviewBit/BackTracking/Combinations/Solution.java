package BackTracking.Combinations;

import java.util.ArrayList;

public class Solution {
	ArrayList<ArrayList<Integer>> res;
    
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
	    res = new ArrayList<>();
	    if (k > n)
	        return res;
	    rec(n, 0, k, new ArrayList<>());
	    return res;
	}
	
	
	public void rec(int n, int last, int k, ArrayList<Integer> temp) {
	    if (k == 0) {
	        res.add(new ArrayList(temp));
	        return;
	    }
	    for (int i = last + 1; i <= n; i++) {
	        temp.add(i);
	        rec(n, i, k - 1, temp);
	        temp.remove(temp.size() - 1);
	    } 
	}
}
