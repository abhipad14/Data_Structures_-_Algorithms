package Math.Math_Palindrome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int a = scanf.nextInt();
		System.out.println(ans.isPalindrome(a));

	}

}
