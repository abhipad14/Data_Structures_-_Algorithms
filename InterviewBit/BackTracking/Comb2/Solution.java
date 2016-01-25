package BackTracking.Comb2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	ArrayList<ArrayList<Integer>> res;
    
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
	    if (A == null)
	        return null;
	    res = new ArrayList<>();
	    Collections.sort(A);
	    rec(A, new ArrayList<>(), B, 0);
	    return res;
	}
	
	public void rec(ArrayList<Integer> A, ArrayList<Integer> ans, int B, int index) {
	    if (B == 0) {
	        res.add(new ArrayList<>(ans));
	        return;
	    }
	    if (B < 0 || index >= A.size())
	        return;   
	    int i = index + 1;
	    for (; i < A.size(); i++)
	        if (A.get(i) != A.get(i - 1))
	            break;
	    rec(A, ans, B, i);
	    ans.add(A.get(index));
	    rec(A, ans, B - A.get(index), index + 1);
	    ans.remove(ans.size() - 1);
	}
}
