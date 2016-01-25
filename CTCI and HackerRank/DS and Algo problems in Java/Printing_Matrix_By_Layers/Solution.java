package Printing_Matrix_By_Layers;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[][] a = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				a[i][j] = scanf.nextInt();
			}
		}
		
		PrintByLayers(a);
	}
	
	
	public static void PrintByLayers(int[][] a){
		int n = a.length-1;
		for(int i=n; i>=0; i--){
			for(int j=0; j<=n-i; j++){
				System.out.print(a[i+(j)][j]+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++){
			int row =0;
			int column = i ;
			for(int j=1; j<=n-i+1; j++){
				System.out.print(a[row++][column++]+" ");
			}
			System.out.println();
		}
	}

}
