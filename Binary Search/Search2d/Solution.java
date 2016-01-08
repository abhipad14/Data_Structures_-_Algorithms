package Binary_Search.Search2d;

import java.util.ArrayList;

public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
		int answer  = 0;
		int row = a.size();
		for(int i=0; i<row; i++){
			ArrayList<Integer> temp = a.get(i);
			if(temp.get(0)<=b &&  temp.get(temp.size()-1)>= b){
				answer = binary(temp, b);
				if(answer==1){
					break;
				}
			}
		}
		return answer;
	}

	public int binary(ArrayList<Integer> a, int key){
		int left=0, right = a.size()-1; 
		
		while(left<=right){
			int mid  = left+(right-left)/2;
			if(a.get(mid)==key){
				return 1;
				
			}
			else if(a.get(mid)<key){
				left = mid+1;
			}
			else{
				right = mid-1;
			}
		}
		return 0;
	}
	
}
