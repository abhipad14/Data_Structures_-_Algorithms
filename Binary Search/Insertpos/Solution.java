package Binary_Search.Insertpos;

import java.util.ArrayList;

public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
		int answer = 0;
		answer = binary(a, b);
		if(a.get(answer)==b){
			return answer;
		}
		else{
			
			if(a.get(answer)<b){
				return ++answer;
			}
			else{
				return answer;
			}
			
		}
		
	}
	
	
	
	public int binary(ArrayList<Integer> a, int key){
		int left=0, right = a.size()-1; 
		int answer = -1;
		int mid=0;
		while(left<=right){
			 mid  = left+(right-left)/2;
			 
			if(a.get(mid)==key){
				answer = mid;
				return answer;
				
			}
			else if(a.get(mid)<key){
				left = mid+1;
			}
			else{
				right = mid-1;
			}
		}
		
		return mid;
		

	}
}
