package Math.Math_Gcd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int a = scanf.nextInt();
		int b = scanf.nextInt();
		System.out.println(ans.gcd(a, b));

	}

}
