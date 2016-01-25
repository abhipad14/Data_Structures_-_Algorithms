package Binary_Search.Pow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		
		int x = scanf.nextInt();
		int n = scanf.nextInt();
		int d = scanf.nextInt();
		System.out.println(ans.pow(x, n, d));
	}

}
