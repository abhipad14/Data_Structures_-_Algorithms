package Hashing.Substring;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.next();
		int n = scanf.nextInt();
		ArrayList<String> b = new ArrayList<>();
		for(int i=0; i<n; i++){
			b.add(scanf.next());
		}
		System.out.println(ans.findSubstring(a, b).toString());

	}

}
