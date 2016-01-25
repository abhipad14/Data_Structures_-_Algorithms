package BackTracking.NQueen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int a = scanf.nextInt();
		ArrayList<ArrayList<String>> answer = new ArrayList<>();
		answer = ans.solveNQueens(a);
		for(ArrayList<String> i: answer){
			for(String s: i){
				System.out.println(s);
			}
			System.out.println("----------");
		}

	}

}
