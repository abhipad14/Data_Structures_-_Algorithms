package Binary_Search.Rotatedarray;

import java.util.ArrayList;

public class Solution {
	public int findMin(ArrayList<Integer> a) {
		
		int size = a.size();
		int left = 0; 
		int right = size-1;
		int answer  = -1;
		while(left<=right){
		    if(a.get(left)<=a.get(right)){
			    answer  = left;
			    break;
		    }
			int mid = (left + right)/2;
			int next = (mid+1)%size;
			int prev = (mid+size-1)%size;
			if(a.get(mid)<=a.get(next)  && a.get(prev)>=a.get(mid)){
				answer = mid; 
				break;
			}
			else if(a.get(mid)<=a.get(right)){
				right = mid-1;
			}
			else{
				left = mid+1;
			}
		}
		answer =  a.get(answer);
		return answer;
		
	}
}
