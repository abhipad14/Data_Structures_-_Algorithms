package BackTracking.PremSeq;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int n = scanf.nextInt();
		int k = scanf.nextInt();
		System.out.println(ans.getPermutation(n, k));
	}

}
