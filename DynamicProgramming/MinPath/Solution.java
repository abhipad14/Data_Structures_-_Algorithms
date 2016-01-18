package DynamicProgramming.MinPath;

import java.util.ArrayList;

public class Solution {
	public int minPathSum(ArrayList<ArrayList<Integer>> a) {
		int answer = 0;
		int m = a.size();
		if(a.size()==0){
			return 0;
		}
		int n = a.get(0).size();
		int[][] count = new int[m][n];
		answer = ways(0, 0, a, count, m, n);
		return answer;
	}
	
	
	public int ways(int i, int j, ArrayList<ArrayList<Integer>> a, int[][] count, int m, int n){
		if(i>=m || j>=n){
			return Integer.MAX_VALUE;
		}
		if(i==m-1 && j==n-1){
			return a.get(i).get(j);
		}
		if(count[i][j]!=0){
			return count[i][j];
		}
		else{
			count[i][j] = a.get(i).get(j)+Math.min(ways(i, j+1, a, count, m, n), ways(i+1, j, a, count, m, n));
			return count[i][j];
		}
	}
}
