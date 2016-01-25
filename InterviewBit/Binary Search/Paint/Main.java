package Binary_Search.Paint;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int a = scanf.nextInt();
		int b = scanf.nextInt();
		int n = scanf.nextInt();
		ArrayList<Integer> c = new ArrayList<>();
		for(int i=0; i<n; i++){
			c.add(scanf.nextInt());
		}
		System.out.println(ans.paint(a, b, c));

	}

}
