package Pairs_With_Difference_k;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] a = {1, 5, 3, 4, 2};
		int k = 2;
		System.out.println(pairs(a,k));
	}

	
	
	public static int pairs(int[] a, int k){
		int pairs=0;
		Arrays.sort(a);
		for(int i=0; i<a.length; i++){
			int low = i;
			int high = a.length-1;
			int mid;
			
			while(low<=high){
				if(high-low==1){
					
					if(a[high]-a[i]==k){
						pairs++;
						
						break;
					}
					else{
						break;
					}
				}
				mid = (low+high)/2;
				
				if(Math.abs(a[i]-a[mid])==k){
					
					pairs++;
					
					break;
				}
				else if(Math.abs(a[i]-a[mid])>k){
					if(a[i]<a[mid]){
						high = mid;
					}
					else{
						low = mid;
					}
				}
				else if(Math.abs(a[i]-a[mid])<k && Math.abs(a[i]-a[mid])>0){
					if(a[i]<a[mid]){
						
						low = mid;
					}
					else{
						high = mid;
					}
				}
				else{
					break;
				}
			}
			
			
		}
		
		
		return pairs;
	}
}
