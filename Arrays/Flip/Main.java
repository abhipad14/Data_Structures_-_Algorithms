package Arrays.Arrays_Flip;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		String A = scanf.next();
		Solution ans = new Solution();
		ArrayList<Integer> a = ans.flip(A);
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}

	}

}
