package Strings.Version;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.nextLine();
		String b = scanf.nextLine();
		System.out.println(ans.compareVersion(a, b));
	}

}
