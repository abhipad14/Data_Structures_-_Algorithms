package Math.Math_Primesum;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int a = scanf.nextInt();
		ArrayList<Integer> answer = new ArrayList<>();
		answer = ans.primesum(a);
		for(int i: answer){
			System.out.print(i+" ");
		}
	}

}
