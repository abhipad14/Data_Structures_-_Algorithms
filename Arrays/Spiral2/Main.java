package Arrays.Arrays_Spiral2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();
		ArrayList<ArrayList<Integer>> temp  = new ArrayList<>();
		Solution ans = new Solution();
		temp = ans.generateMatrix(a);
		for(ArrayList<Integer> i: temp){
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
