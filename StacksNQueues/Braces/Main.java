package StacksNQueues.Braces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.next();
		System.out.println(ans.braces(a));
	}

}
