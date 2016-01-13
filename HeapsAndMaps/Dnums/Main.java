package HeapsAndMaps.Dnums;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		for(int i=0; i<n; i++){
			A.add(scanf.nextInt());
		}
		int B = scanf.nextInt();
		Solution ans = new Solution();
		System.out.println(ans.dNums(A, B).toString());
	}

}
