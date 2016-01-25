package BackTracking.Palinpart;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.nextLine();
		ArrayList<ArrayList<String>> answer = new ArrayList<>();
		answer = ans.partition(a);
		for(ArrayList<String> s : answer){
			System.out.println(s.toString());
		}

	}

}
