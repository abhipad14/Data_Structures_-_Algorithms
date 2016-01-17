package Greedy.Mice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int n = scanf.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++){
			a.add(scanf.nextInt());
		}
		
		ArrayList<Integer> b = new ArrayList<>();
		for(int i=0; i<n; i++){
			b.add(scanf.nextInt());
		}
		
		System.out.println(ans.mice(a, b));

	}

}
