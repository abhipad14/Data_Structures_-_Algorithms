package BackTracking.SubSet2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int n = scanf.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++){
			a.add(scanf.nextInt());
		}
		ArrayList<ArrayList<Integer>> b = new ArrayList<>();
		b = ans.subsetsWithDup(a);
		for(ArrayList<Integer> i:b){
			for(int j: i){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
