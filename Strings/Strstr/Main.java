package Strings.Strstr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String haystack = scanf.nextLine();
		String needle = scanf.nextLine();
		System.out.println(ans.strStr(haystack, needle));

	}

}
