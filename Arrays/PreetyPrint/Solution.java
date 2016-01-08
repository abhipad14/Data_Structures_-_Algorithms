package Arrays.Arrays_CheckPoint_Level2;

import java.util.ArrayList;

public class Solution {

	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		int n = 2*a-1;
		int[][] ans = new int[n][n];
		int counter = 0;
		while(a>0){
			for(int i=counter; i<n-counter; i++){
				ans[counter][i]=a;
			}
			for(int i=counter+1; i<n-counter; i++){
				ans[i][n-counter-1] = a;
			}
			for(int i=n-counter-2; i>=counter; i--){
				ans[n-counter-1][i]=a;
			}
			for(int i=n-counter-2; i>counter; i--){
				ans[i][counter] = a;
			}
			counter++;
			a--;
		}
		for(int i=0; i<n; i++){
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j=0; j<n; j++){
				temp.add(ans[i][j]);
			}
			answer.add(temp);
		}
		return answer;	
	}
}
