package Binary_Search.Serachrange;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> searchRange(ArrayList<Integer> a, int b) {
		ArrayList<Integer> answer  = new ArrayList<>();
		answer.add(-1);
		answer.add(-1);
		int left = binary(a, b, true);
		if(left!=-1){
			int right = binary(a, b, false);
			answer.set(0, left);
			answer.set(1, right);
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
