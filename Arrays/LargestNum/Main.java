package Arrays.Arrays_LargestNum;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int m = scanf.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i=0; i<m; i++){
			a.add(scanf.nextInt());
		}
		Solution ans = new Solution();
		System.out.println(ans.largestNumber(a));

	}

}
