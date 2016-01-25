package DynamicProgramming.WordBreak;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String s = scanf.next();
		ArrayList<String> wordDict = new ArrayList<>();
		int n = scanf.nextInt();
		for(int i=0; i<n; i++){
			wordDict.add(scanf.next());
		}
		System.out.println(ans.wordBreak(s, wordDict));
	}

}
