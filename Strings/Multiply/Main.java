package Strings.Multiply;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.next();
		String b = scanf.next();
		System.out.println(ans.multiply(a, b));
		

	}

}
