package Missing_Numbers_Between_Two_Arrays;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] list1 = new int[n];
		int[] count1 = new int[100];
		int low1=0, low2=0, high1=0, high2=0;
		for(int i=0; i<n; i++){
			list1[i]=scanf.nextInt();
			if(i==1){
				low1 = list1[i];
				high1 = list1[i];
			}
			else{
				if(list1[i]<low1){
					low1=list1[i];
				}
				if(list1[i]>high1){
					high1=list1[i];
				}
			}
		}
		int m = scanf.nextInt();
		int[] list2 = new int[m];
		int[] count2 = new int[100];
		for(int i=0; i<m; i++){
			list2[i]=scanf.nextInt();
			if(i==1){
				low2 = list2[i];
				high2 = list2[i];
			}
			else{
				if(list2[i]<low2){
					low2=list2[i];
				}
				if(list2[i]>high2){
					high2=list2[i];
				}
			}
		}
		
		for(int i=0; i<n; i++){
			count1[(high1-low1)-(high1-list1[i])]++;
		}
		for(int i=0; i<m; i++){
			count2[(high2-low2)-(high2-list2[i])]++;
		}
		
		for(int i=0; i<100; i++){
			if(count1[i]!=count2[i]){
				System.out.print((low1+i)+" ");
			}
		}
	}

}
