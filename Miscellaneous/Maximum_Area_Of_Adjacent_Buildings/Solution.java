package Maximum_Area_Of_Adjacent_Buildings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] heights = new int[n];
		for(int i=0; i<n; i++){
			heights[i]=scanf.nextInt();
		}
		int maxarea = 0;
		int currentarea = 0;
		int currentmin = 0;
		int length = 1;
		for(int i=0; i<n-1; i++){
			length = 1;
			currentarea = 0;
			currentmin = heights[i];
			for(int j=i+1; j<n; j++){
				length++;
				if(heights[j]<currentmin){
					currentmin = heights[j];
				}
				currentarea = currentmin*length;
				if(currentarea > maxarea){
					maxarea = currentarea;
				}
			}
			
		}
		
		System.out.println(maxarea);

	}

}
