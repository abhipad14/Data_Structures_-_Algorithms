package BackTracking.GreyCode;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		ShortSolution ans = new ShortSolution();
		int a = scanf.nextInt();
		System.out.println(ans.grayCode(a).toString());
		Solution an = new Solution();
		System.out.println(ans.grayCode(a));
	}

}
