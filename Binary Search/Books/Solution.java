package Binary_Search.Books;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int books(ArrayList<Integer> a, int b) {
		int len = a.size();
		if(b>len){
		    return -1;
		}
		int minPages = -1;
		int low = Integer.MAX_VALUE;
		int high = 0;
		for(int i:a){
			high+=i;
			if(i<low){
				low = i;
			}
		}
		int mid;
		while(low<=high){
			mid = low + (high-low)/2;
			if(isPossible(b, mid, a)){
				minPages =  mid;
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}
		return minPages;
	}
	
	
	public boolean isPossible(int students, int value, ArrayList<Integer> a){
		int allotatedStudents = 1;
		int len = a.size();
		int index = 0;
		int totalpages= 0;
		while(allotatedStudents<=students  && index<len){
			totalpages += a.get(index);
			if(totalpages>value){
				totalpages = 0;
				allotatedStudents++;
			}
			else{
				index++;
			}
		}
		
		if(index<len){
			return false;
		}
		else{
			return true;
		}
	}
}
