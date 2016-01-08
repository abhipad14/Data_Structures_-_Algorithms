package Binary_Search.Sqrt;

import java.util.ArrayList;

public class Solution {
	public int sqrt(int a) {
		int left = 1;
		int right = a;
		int answer=0;
		while(left<=right){
			int mid = left +(right-left)/2;
			if(mid == a/mid && (a%mid==0)){
				answer = mid;
				break;
			}
			if(mid<=a/mid){
				answer = mid;
				left = mid+1;
				
			}
			else{
				right = mid-1;
				
			}
		}
		return answer;
	}
	
	
	
}
