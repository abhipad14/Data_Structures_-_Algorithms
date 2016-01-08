package Arrays.Arrays_Pascal2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();
		ArrayList<Integer> temp = new ArrayList<>();
		Solution ans = new Solution();
		temp = ans.getRow(a);
		for(int i: temp){
			System.out.println(i);
		}

	}

}
