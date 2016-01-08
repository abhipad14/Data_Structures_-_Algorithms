package BackTracking.LetterPhone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.next();
		ArrayList<String> answer = new ArrayList<>();
		answer = ans.letterCombinations(a);
		System.out.println(answer.toString());

	}

}
