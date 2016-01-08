package Math.Math_Paths;

public class Solution {
	public int uniquePaths(int a, int b) {
		int answer =0;
		int [][] arr = new int[a][b];
		answer = paths(a, b, arr, 0, 0, 0);
		return answer;
	}
	
	
	public int paths(int a, int b, int[][] arr, int i, int j, int count){
		if(i>=a || j>=b){
			return 0;
		}
		else if(i==a-1 && j==b-1){
			return ++count;
		}
		else{
			if(arr[i][j]>0){
				return arr[i][j];
			}
			else{
				arr[i][j] = paths(a, b, arr, i+1, j, count)+paths(a, b, arr, i, j+1, count);
				return arr[i][j];
			}
		}
	}
}
