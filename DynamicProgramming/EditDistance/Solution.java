package DynamicProgramming.EditDistance;

public class Solution {
	 public int minDistance(String a, String b) {
		 int row = a.length();
		 int col = b.length();
		 int[][] count = new int[row+1][col+1];
		 for(int i=0; i<=row; i++){
			 count[i][0] = i;
		 }
		 for(int i=0; i<=col; i++){
			 count[0][i] = i;
		 }
		 
		 for(int i=1; i<=row; i++){
			 for(int j=1; j<=col; j++){
				 if(a.charAt(i-1)==b.charAt(j-1)){
					 count[i][j] = count[i-1][j-1];
				 }
				 else{
					 count[i][j] = 1+Math.min(count[i-1][j-1], Math.min(count[i-1][j], count[i][j-1]));
				 }
			 }
		 }
		 return count[row][col];
	 }
}
