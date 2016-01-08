package Strings.ZigZag;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.next();
		int b = scanf.nextInt();
		System.out.println(ans.convert(a, b));
	}

}
