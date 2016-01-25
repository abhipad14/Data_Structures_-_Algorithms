package TwoPointer.Maxone;

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
		int b = scanf.nextInt();
		a = ans.maxone(a, b);
		for(int i:a){
			System.out.println(i);
		}

	}

}
