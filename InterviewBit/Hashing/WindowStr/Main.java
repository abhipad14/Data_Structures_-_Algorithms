package Hashing.WindowStr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String S = scanf.next();
		String T = scanf.next();
		System.out.println(ans.minWindow(S, T));

	}

}
