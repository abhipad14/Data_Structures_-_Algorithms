package Find_Number_In_Sorted_But_Rotated_Array;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i]=scanf.nextInt();
		}
		int toFind = scanf.nextInt();
		int i =Find(a, toFind);
		if(i==-1){
			System.out.println("Not Found");
		}
		else{
			System.out.println("Found at position:"+(i+1));
		}
	}

	
	
	public static int Find(int[] a, int k){
		int left = 0, right = a.length-1;
		int mid;
		while(left<=right){
			mid = (left+right)/2;
			if(a[mid]==k){
				return mid;
			}
			else{
				if(left<= mid-1){
					if(a[left]<a[mid-1]){
						if(a[mid-1]>=k  && k>=a[left]){
							right = mid-1;
						}
						else{
							left = mid+1;
						}
					}
					else{
						if(a[mid+1]<=k  && k<=a[right]){
							left = mid+1;
						}
						else{
							right = mid-1;
						}
					}
				}
				else{
					left = mid+1;
				}
			}
		}
		
		return -1;
	}
}
