package BackTracking.Permutations;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int n= scanf.nextInt();
		ArrayList<Integer> a= new ArrayList<>();
		for(int i=0; i<n; i++){
			a.add(scanf.nextInt());
		}
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		answer = ans.permute(a);
		for(ArrayList<Integer> i: answer){
			System.out.println(i.toString());
		}

	}

}
