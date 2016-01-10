package N_Storey_K_Eggs_Problem;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int k = scanf.nextInt();
		int[][] value = new int[k][n];
		for(int i=0; i<k; i++){
			for(int j=0; j<n; j++){
				if(i==0){
					value[i][j]=i+1;
				}
				else{
					value[i][j]=-1;
				}
			}
		}
		floor(n, k, value);
		System.out.println(value[k-1][n-1]);
	}

	
	public static void floor(int n, int k, int[][] value){
		for(int i=1; i<k; i++){
			for(int j=0; j<n; j++){
				if(i>j){
					value[i][j]=value[i-1][j];
				}
				else{
					value[i][j] = Math.max(1+value[i-1][j-1], 1);
				}
			}
		}
	}
}
