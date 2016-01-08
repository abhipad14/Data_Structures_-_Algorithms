package BackTracking.Sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int n = scanf.nextInt();
		ArrayList<ArrayList<Character>> a = new ArrayList<>();
		for(int i=0; i<n; i++){
			ArrayList<Character> temp = new ArrayList<>();
			String row = scanf.next();
			char[] car = row.toCharArray();
			for(int j=0; j<n; j++){
				temp.add(car[j]);
			}
			a.add(temp);
		}
		
		ans.solveSudoku(a);
	}

}
