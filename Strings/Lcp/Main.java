package Strings.Lcp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int n = scanf.nextInt();
		ArrayList<String> a = new ArrayList<>();
		for(int i=0; i<n; i++){
			a.add(scanf.next());
		}
		System.out.println(ans.longestCommonPrefix(a));
	}

}
