package Hashing.ValidSudoku;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	public int isValidSudoku(ArrayList<String> a) {
		int answer = 1;
		if(a.size()!=9){
			return 0;
		}
		int[][] sudoku = new int[a.size()][a.size()];
		int counter  =0;
		for(String s:a){
			for(int i=0; i<9; i++){
				if(s.charAt(i)!='.'){
					int num  = Integer.parseInt(s.substring(i, i+1));
					sudoku[counter][i]=num;
				}
			}
			counter++;
		}
		
		for(int i=0; i<9; i++){
			if(!rowValid(sudoku[i])){
				return 0;
			}
		}
		
		for(int i=0; i<9; i++){
			if(!colValid(sudoku, i)){
				return 0;
			}
		}
		
		for(int i=0; i<9; i+=3){
			for(int j=0; j<9; j+=3){
				if(!subGrid(sudoku, i, j)){
					return 0;
				}
			}
		}
		
		return answer;
	}
	
	
	public boolean rowValid(int[] row){
		boolean valid = true;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<9; i++){
			if(row[i]!=0){
				if(set.isEmpty()){
					set.add(row[i]);
				}
				else{
					if(set.contains(row[i])){
						return false;
					}
					else{
						set.add(row[i]);
					}
				}
			}
		}
		return valid;
	}
	
	
	
	public boolean colValid(int[][] sud, int col){
		boolean valid = true;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<9; i++){
			if(sud[i][col]!=0){
				if(set.isEmpty()){
					set.add(sud[i][col]);
				}
				else{
					if(set.contains(sud[i][col])){
						return false;
					}
					else{
						set.add(sud[i][col]);
					}
				}
			}
		}
		return valid;
	}
	
	
	public boolean subGrid(int[][] sud, int row, int col){
		boolean valid = true;
		HashSet<Integer> set = new HashSet<>();
		for(int i=row; i<row+3; i++){
			for(int j=col; j<col+3; j++){
				if(sud[i][j]!=0){
					if(set.isEmpty()){
						set.add(sud[i][j]);
					}
					else{
						if(set.contains(sud[i][j])){
							return false;
						}
						else{
							set.add(sud[i][j]);
						}
					}
				}
			}
		}
		return valid;
	}
}
