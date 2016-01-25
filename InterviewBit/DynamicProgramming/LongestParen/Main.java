package DynamicProgramming.LongestParen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String s = scanf.nextLine();
		System.out.println(ans.longestValidParentheses(s));

	}

}
