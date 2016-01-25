package Arrays.Arrays_CheckPoint_Level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		Solution ans = new Solution();
		answer = ans.prettyPrint(a);
		for(ArrayList<Integer> i : answer){
			for(int j: i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		

	}

}
