package Find_One_Subarray_If_Sorted_Entire_Array_Gets_Sorted;

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
		int left = n-1;
		int right = 0;
		int mids = 0;
		int mide = 0;
		for(int i=1; i<n; i++){
			if(a[i]<a[i-1]){
				left = i-1;
				mids = i;
				break;
			}
		}
		if(mids==0){
			System.out.println("Array Already Sorted");
		}
		else{
			for(int j=n-2; j>=0; j--){
				if(a[j]>a[j+1]){
					mide = j;
					right = j+1;
					break;
				}
			}
			int max = max(a, mids, mide);
			int min = min(a, mids, mide);
			for(int i=left; i>=0; i--){
				if(a[i]< min){
					break;
				}
				else{
					mids = i;
				}
			}
			for(int i=right; i<n; i++){
				if(a[i]>max){
					break;
				}
				else{
					mide = i;
				}
			}
			
			int[] b = new int[mide-mids+1];
			
			for(int i=0; i<mide-mids+1; i++){
				b[i] = a[mids+i];
			}
			Arrays.sort(b);
			
			int counter = 0;
			for(int i=0; i<n; i++){
				if(i<=mids-1){
					System.out.print(a[i]+"->");
				}
				else if(i>=mide+1){
					System.out.print(a[i]+"->");
				}
				else{
					System.out.print(b[counter++]+"->");
				}
			}
		}
		

	}

	
	
	public static int min(int[] a, int s, int e){
		if(s==e){
			return a[e];
		}
		else{
			return Math.min(a[s], min(a, s+1, e));
		}
		
	}
	
	
	public static int max(int[] a, int s, int e){
		if(s==e){
			return a[e];
		}
		else{
			return Math.max(a[s], max(a, s+1, e));
		}
	}
}
