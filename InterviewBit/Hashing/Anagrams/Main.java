package Hashing.Anagrams;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		int n = scanf.nextInt();
		ArrayList<String> a= new ArrayList<>();
		for(int i=0; i<n; i++){
			a.add(scanf.next());
		}
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		answer = ans.anagrams(a);
		for(ArrayList<Integer> i:answer){
			System.out.println(i.toString());
		}

	}

}
