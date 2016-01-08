package Binary_Search.Search2d;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int m = scanf.nextInt();
		int n = scanf.nextInt();
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i=0; i<m; i++){
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j=0; j<n; j++){
				temp.add(scanf.nextInt());
			}
			a.add(temp);
		}
		int b = scanf.nextInt();
		System.out.println(ans.searchMatrix(a, b));

	}

}
