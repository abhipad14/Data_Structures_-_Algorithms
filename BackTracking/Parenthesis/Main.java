package BackTracking.Parenthesis;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int a = scanf.nextInt();
		ArrayList<String> answer = new ArrayList<>();
		answer = ans.generateParenthesis(a);
		System.out.println(answer.toString());
		System.out.println(answer.size()+" possible valid combinations");
	}

}
