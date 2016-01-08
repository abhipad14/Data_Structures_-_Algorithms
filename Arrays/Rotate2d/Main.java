package Arrays.Arrays_Rotate2d;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int m = scanf.nextInt();
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i=0; i<m; i++){
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j=0; j<m; j++){
				temp.add(scanf.nextInt());
			}
			a.add(temp);
		}
		Solution ans = new Solution();
		ans.rotate(a);
		
	}

}
