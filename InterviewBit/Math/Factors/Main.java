package Math.Math_Factors;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();
		Solution ans = new Solution();
		ArrayList<Integer> answer = new ArrayList<>();
		answer = ans.allFactors(a);
		for(int i: answer){
			System.out.print(i+" ");
		}

	}

}
