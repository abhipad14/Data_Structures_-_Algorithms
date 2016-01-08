package Arrays.Arrays_Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		ArrayList<Integer> arrive = new ArrayList<>();
		ArrayList<Integer> depart = new ArrayList<>();
		
		for(int i=0; i<n; i++){
			arrive.add(scanf.nextInt());
		}
		for(int i=0; i<n; i++){
			depart.add(scanf.nextInt());
		}
		int K = scanf.nextInt();
		Solution ans = new Solution();
		System.out.println(ans.hotel(arrive, depart, K));
	}

}
