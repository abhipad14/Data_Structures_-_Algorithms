package BackTracking.Comb;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	ArrayList<ArrayList<Integer>> res;
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
	    res = new ArrayList<>();
	    ArrayList<Integer> unique = new ArrayList<>();
	    if (A == null)
	        return res; 
	    Collections.sort(A);
	    unique.add(A.get(0));
	    for (int i = 0; i < A.size(); i++) {
	        if (i != 0 && A.get(i) != A.get(i - 1))
	            unique.add(A.get(i));
	    }
	    combinationSum(unique, new ArrayList<>(), B, 0); 
	    return res;
	}
	
	
	public void combinationSum(ArrayList<Integer> A, ArrayList<Integer> res, int B, int index) {
	    if (B == 0) {
	        this.res.add(new ArrayList(res));
	        return;
	    }
	    if (B < 0) {
	        return;
	    }
	    for (int i = index; i < A.size(); i++) {
	        int num = A.get(i);
	        res.add(num);
	        combinationSum(A, res, B - num, i);
	        res.remove(res.size() - 1);
	    }
	}
}
