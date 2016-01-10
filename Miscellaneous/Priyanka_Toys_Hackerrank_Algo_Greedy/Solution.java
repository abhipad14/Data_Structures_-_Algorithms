package Priyanka_Toys_Hackerrank_Algo_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scanf.nextInt();
		}
		Arrays.sort(a);
		int curwght=a[0];
		int count=1;
		for(int i=0; i<n; i++){
			if(a[i]>= curwght  &&  a[i]<= curwght+4){
				continue;
			}
			else{
				count++;
				curwght = a[i];
			}
		}
		System.out.println(count);

	}

}
