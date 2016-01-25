package Arrays.Arrays_Pascal1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();
		ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
		Solution ans = new Solution();
		temp = ans.generate(a);
		int size = temp.size();
		for(int i=0; i<size; i++){
			ArrayList<Integer> dummy = new ArrayList<>();
			dummy = temp.get(i);
			for(int j : dummy){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
