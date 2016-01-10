package Spiral_Print_Of_Given_Matrix;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				matrix[i][j] = scanf.nextInt();
			}
		}
		int counter = 0;
		int limit;
		int len = n-counter-1;
		if(n%2 == 0)
			limit = n/2;
		else
			limit = n/2 +1;
		while(counter < limit){
			
			for(int i= counter; i<len; i++)
				System.out.print(matrix[counter][i]+"->");
			for(int i=counter; i<len; i++)
				System.out.print(matrix[i][n-counter-1]+"->");
			for(int i=n-counter-1; i>0+counter; i--)
				System.out.print(matrix[n-counter-1][i]+"->");
			for(int i=n-counter-1; i>0+counter; i--)
				System.out.print(matrix[i][counter]+"->");
				
			counter++;
			len -= 1;
		}
		if(n%2 == 1)
			System.out.print(matrix[n/2][n/2]+"->");

		
	}

}
