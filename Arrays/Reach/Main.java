package Arrays.Arrays_Reach;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int m = scanf.nextInt();
		ArrayList<Integer> X = new ArrayList<>();
		for(int i=0; i<m; i++){
			X.add(scanf.nextInt());
		}
		m = scanf.nextInt();
		ArrayList<Integer> Y = new ArrayList<>();
		for(int i=0; i<m; i++){
			Y.add(scanf.nextInt());
		}
		Solution answer = new Solution();
		
		System.out.println(answer.coverPoints(X, Y));
	}

}
