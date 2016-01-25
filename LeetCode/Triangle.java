/*
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

Note:
Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
*/


public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        if(m==0){
        	return 0;
        }
        if(m==1){
        	return triangle.get(0).get(0);
        }
        int n = triangle.get(m-1).size();
        int[][] count = new int[m][n];
        for(int i=0; i<n; i++){
        	count[m-1][i]= triangle.get(m-1).get(i);
        }
        sum(triangle, m, 0, count);
        return count[0][0];
    }
    
    
    public void sum(List<List<Integer>> a, int m, int i, int[][] count){
		if(i<m-2){
			sum(a, m, i+1, count);
		}
		int n = a.get(i).size();
		for(int k=0; k<n; k++){
			count[i][k] = a.get(i).get(k)+ Math.min(count[i+1][k], count[i+1][k+1]);
		}
	}
}
