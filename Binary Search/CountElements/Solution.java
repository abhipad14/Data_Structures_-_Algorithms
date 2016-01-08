package Binary_Search.CountElements;

import java.util.ArrayList;

public class Solution {
	public int findCount(ArrayList<Integer> a, int b) {
		int answer = 0;
		int left = binary(a, b, true);
		if(left==-1){
			answer = 0;
		}
		else{
			int right = binary(a, b, false);
			answer  = right-left+1;
		}
		return answer;
	}

	
	public int binary(ArrayList<Integer> a, int key, boolean isFirst){
		int result=-1, left=0, right = a.size()-1; 
		
		while(left<=right){
			int mid  = left+(right-left)/2;
			if(a.get(mid)==key){
				result = mid;
				if(isFirst){
					right =  mid-1;
				}
				else{
					left = mid+1;
				}
			}
			else if(a.get(mid)<key){
				left = mid+1;
			}
			else{
				right = mid-1;
			}
		}
		return result;
	}
}
