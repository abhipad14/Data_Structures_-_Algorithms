package BackTracking.NQueen;

import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<String>> solveNQueens(int a) {
		ArrayList<ArrayList<String>> answer = new ArrayList<>();
		int[][] board = new int[a][a];
		getPositions(answer, 0, a, board);
		return answer;
	}
	
	
	
	public void getresult(ArrayList<ArrayList<String>> answer, int[][] board, int q){
		ArrayList<String> res = new ArrayList<>();
		for(int k=0; k<q; k++){
			StringBuilder tempstr = new StringBuilder();
			for(int l=0; l<q; l++){
				if(board[k][l]==0){
					tempstr.append('.');
				}
				else{
					tempstr.append('Q');
				}
			}
			res.add(tempstr.toString());
		}
		answer.add(res);
	}
	
 	public void getPositions(ArrayList<ArrayList<String>> answer, int row, int q, int[][] temp){
		
		for(int i=0; i<q; i++){
			int[][] board = new int[q][q];
			for(int m=0; m<q; m++){
				for(int j=0; j<q; j++){
					board[m][j]=temp[m][j];
				}
			}
			if(isSafe(board, row, i, q)){
				board[row][i]=1;
				if(row==q-1){
					getresult(answer, board, q);
				}
				else{
					getPositions(answer, row+1, q, board);
				}
			}
		}
	}
	
	public boolean isSafe(int[][] board, int row, int col, int n){
		for(int i=0; i<n; i++){
			if(board[row][i]==1 || board[i][col]==1){
				return false;
			}
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(Math.abs(i-row)==Math.abs(j-col)){
					if(board[i][j]==1){
						return false;
					}
				}
			}
		}
		return true;
	}
	
}
