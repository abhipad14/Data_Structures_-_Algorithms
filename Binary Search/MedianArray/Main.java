package Binary_Search.MedianArray;

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
		int m = scanf.nextInt();
		ArrayList<Integer> b = new ArrayList<>();
		for(int i=0; i<m; i++){
			b.add(scanf.nextInt());
		}
		System.out.println(ans.findMedianSortedArrays(a, b));

	}

}
