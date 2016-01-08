package Math.Math_Decibin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();
		Solution ans = new Solution();
		System.out.println(ans.findDigitsInBinary(a));
	}

}
