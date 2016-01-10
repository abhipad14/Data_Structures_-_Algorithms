package Submatrix_With_Max_Sum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int m = scanf.nextInt();
		int n = scanf.nextInt();
		int[][] a = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=scanf.nextInt();
			}
		}
		int[] mat = new int[m];
		int count = n;
		int left = 0;
		int right = 0;
		int currleft = 0;
		int maxsum = 0;
		int up = 0;
		int down = 0;
		while(currleft<n){
			
			int currright = left;
			while(currright<n){
				for(int i=0; i<m; i++){
					int sum = 0;
					for(int j=currleft; j<=currright; j++){
						sum += a[i][j];
					}
					mat[i]=sum;
				}
				
				
				
				int currentSum = 0;
				int currup = 0;
				int currdown = 0;
				
				int len = mat.length;
				for(int i=0; i<len; i++){
					if(currentSum==0){
						currup=i;
					}
					currdown = i;
					currentSum += mat[i];
					if(currentSum < 0){
						currentSum = 0;
					}
					if(currentSum > maxsum){
						maxsum = currentSum;
						up = currup;
						down = currdown;
						left = currleft;
						right = currright;
					}
				}
				
				
				currright++;
			}
			currleft++;
		}
		System.out.println("SUM="+maxsum);
		System.out.println("---------Matrix-----------");
		for(int i=up; i<=down; i++){
			for(int j=left; j<=right; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	
}
