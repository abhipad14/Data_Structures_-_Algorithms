package Binary_Search.Searchrotated;

import java.util.ArrayList;

public class Solution {
	public int search(ArrayList<Integer> a, int b) {
		 int answer = -1;
		 int left = 0;
		 int right = a.size()-1;
		 while(left<=right){
			 int mid =left +(right-left)/2;
			 if(a.get(mid)== b){
				 answer = mid;
				 break;
			 }
			 else if(a.get(left)<a.get(mid)){
				 if(b>=a.get(left) && b<a.get(mid)){
					 right = mid-1;
				 }
				 else{
					 left = mid+1;
				 }
			 }
			 else{
				 if(b<=a.get(right) && b>a.get(mid)){
					 left = mid+1;
				 }
				 else{
					 right = mid-1;
				 }
			 }
		 }
		 return answer;
	}
}
