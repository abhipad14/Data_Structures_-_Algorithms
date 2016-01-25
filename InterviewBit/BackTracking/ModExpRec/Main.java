package BackTracking.ModExpRec;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int a = scanf.nextInt();
		int b = scanf.nextInt();
		int c = scanf.nextInt();
		System.out.println(ans.Mod(a, b, c));

	}

}
