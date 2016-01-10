package Merging_Two_Sorted_Arrays;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] a = new int[10000];
		for(int i=0; i<n; i++){
			a[i]=scanf.nextInt();
		}
		int m = scanf.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++){
			b[i]=scanf.nextInt();
		}
		Merge(a,b,n,m);
		for(int i=0; i<n+m; i++){
			System.out.print(a[i]+"->");
		}
	}

	
	public static void Merge(int[] a, int[] b, int n, int m){
		int i = n-1;
		int j = m-1;
		int counter = n+m-1;
		while(counter>=0 && i>=0  && j>=0){
			if(a[i]>b[j]){
				a[counter] = a[i];
				i--;
				counter--;
			}
			else{
				a[counter] = b[j];
				j--;
				counter--;
			}
		}
		if(i<0){
			while(j>=0){
				a[counter] = b[j];
				j--;
				counter--;
			}
		}
		else if(j<0){
			a[counter] = a[i];
			i--;
			counter--;
		}
	}
}
