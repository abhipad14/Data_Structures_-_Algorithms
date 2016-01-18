package DynamicProgramming.Triangle;

import java.util.ArrayList;

public class Solution {
	public int minimumTotal(ArrayList<ArrayList<Integer>> a) {
        int m = a.size();
        if(m==0){
        	return 0;
        }
        if(m==1){
        	return a.get(0).get(0);
        }
        int n = a.get(m-1).size();
        int[] count = new int[n];
        for(int i=0; i<n; i++){
        	count[i]= a.get(m-1).get(i);
        }
        sum(a, m, 0, count);
        return count[0];
    }
	
	
	public void sum(ArrayList<ArrayList<Integer>> a, int m, int i, int[] count){
		if(i<m-2){
			sum(a, m, i+1, count);
		}
		int n = a.get(i).size();
		for(int k=0; k<n; k++){
			count[k] = a.get(i).get(k)+ Math.min(count[k], count[k+1]);
		}
	}
}
