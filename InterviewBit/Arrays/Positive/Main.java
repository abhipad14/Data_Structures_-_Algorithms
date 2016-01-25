package Arrays.Arrays_Positive;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++){
			a.add(scanf.nextInt());
		}
		Solution ans = new Solution();
		System.out.println(ans.firstMissingPositive(a));

	}

}
