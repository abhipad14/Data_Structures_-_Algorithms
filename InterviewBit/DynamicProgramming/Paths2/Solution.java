package DynamicProgramming.Paths2;

import java.util.ArrayList;

public class Solution {
	public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> a) {
		int answer = 0;
		int m = a.size();
		if(m==0){
			return 0;
		}
		int n = a.get(0).size();
		int[][] count = new int [m][n];
		answer = ways(a, 0, 0, count, m, n);
		return answer;
	}
	
	
	public int ways(ArrayList<ArrayList<Integer>> a, int i, int j, int[][] count, int m, int n){
		if(i>=m  || j>=n){
			return 0;
		}
		if(a.get(i).get(j)==1){
			return 0;
		}
		if(i==m-1 && j==n-1){
			return 1;
		}
		
		if(count[i][j]!=0){
			return count[i][j];
		}
		else{
			count[i][j] = ways(a, i, j+1, count, m, n)+ ways(a, i+1, j, count, m, n);
			return count[i][j];
		}
	}
}
