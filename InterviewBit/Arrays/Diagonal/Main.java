package Arrays.Arrays_Diagonal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i=0; i<n; i++){
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j=0; j<n; j++){
				temp.add(scanf.nextInt());
			}
			a.add(temp);
		}
		Solution ans = new Solution();
		a = ans.diagonal(a);
		for(ArrayList<Integer> i: a){
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
