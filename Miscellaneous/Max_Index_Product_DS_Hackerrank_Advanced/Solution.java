package Max_Index_Product_DS_Hackerrank_Advanced;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = scanf.nextInt();
		}
		long product = 0, max = 0;
		for(int i=1; i<n-1; i++){
			long left=0, right=0;
			for(int j=i-1; j>=0; j--){
				if(a[j]>a[i]){
					left = j+1;
					break;
				}
			}
			if(left == 0){
				break;
			}
			for(int j=i+1; j<n; j++){
				if(a[j]>a[i]){
					right = j+1;
					break;
				}
			}
			product = left * right;
			if(product >max){
				max = product;
			}
		}
		System.out.println(max);

	}

}
