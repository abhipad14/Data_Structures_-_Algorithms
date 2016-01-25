package DynamicProgramming.Dungeon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int m  = scanf.nextInt();
		int n = scanf.nextInt();
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i=0; i<m; i++){
			ArrayList<Integer> row = new ArrayList<>();
			for(int j=0; j<n; j++){
				row.add(scanf.nextInt());
			}
			a.add(row);
		}
		System.out.println(ans.calculateMinimumHP(a));

	}

}
