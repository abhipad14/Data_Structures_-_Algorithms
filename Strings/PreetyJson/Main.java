package Strings.PreetyJson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.nextLine();
		ArrayList<String> json = ans.prettyJSON(a);
		for(String s: json){
			System.out.println(s);
		}
	}

}
