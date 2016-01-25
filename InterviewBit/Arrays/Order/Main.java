package Trees.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		ArrayList<Integer> heights = new ArrayList<>();
		ArrayList<Integer> infronts = new ArrayList<>();
		for(int i=0; i<n; i++){
			heights.add(scanf.nextInt());
		}
		
		for(int i=0; i<n; i++){
			infronts.add(scanf.nextInt());
		}
		Solution ans = new Solution();
		System.out.println(ans.order(heights, infronts).toString());
	}

}
