package DynamicProgramming.EditDistance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String s1 = scanf.next();
		String s2 = scanf.next();
		System.out.println(ans.minDistance(s1, s2));

	}

}
