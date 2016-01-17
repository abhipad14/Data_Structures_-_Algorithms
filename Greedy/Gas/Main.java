package Greedy.Gas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int n = scanf.nextInt();
		ArrayList<Integer> gas = new ArrayList<>();
		for(int i=0; i<n; i++){
			gas.add(scanf.nextInt());
		}
		ArrayList<Integer> cost = new ArrayList<>();
		for(int i=0; i<n; i++){
			cost.add(scanf.nextInt());
		}
		System.out.println(ans.canCompleteCircuit(gas, cost));
	}

}
