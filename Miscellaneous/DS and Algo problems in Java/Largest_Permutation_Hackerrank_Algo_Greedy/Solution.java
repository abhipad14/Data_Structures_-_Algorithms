package Largest_Permutation_Hackerrank_Algo_Greedy;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int k = scanf.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scanf.nextInt();
		}
		int i=0,count=0,maxindex=0, temp, max;
		while(count<k && i<n){
			max = a[i];
			for(int j=i+1; j<n; j++){
				if(a[j]>max){
					maxindex = j;
					max = a[j];
				}
			}
			if(max!=a[i]){
				temp = a[maxindex];
				a[maxindex]=a[i];
				a[i] = temp;
				count++;
			}
			i++;
		}
		for(int j=0; j<n; j++){
			System.out.print(a[j]+" ");
		}
	}

}
