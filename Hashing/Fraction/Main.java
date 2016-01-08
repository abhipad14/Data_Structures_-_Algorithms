package Hashing.Fraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		
		
		int numerator = scanf.nextInt();
		int denominator = scanf.nextInt();
		
		System.out.println(ans.fractionToDecimal(numerator, denominator));

	}

}
