package Binary_Search.Paint;

import java.util.ArrayList;

public class Solution {
	public int paint(int a, int b, ArrayList<Integer> c) {
	    
	    int minTime = 0;
	    int mod = 10000003;
	    long start = 0;
	    long end = Long.MAX_VALUE;
	    long mid;
	    while(start<=end){
	    	mid = start + (end-start)/2;
	    	if(isTimeSufficient(a, b, mid, c)){
	    		minTime = (int)(mid%mod);
	    		end = mid-1;
	    	}
	    	else{
	    		start = mid+1;
	    	}
	    }
	    return minTime;
	    
	}

	public boolean isTimeSufficient(int painters, int timePerBoard, long time, ArrayList<Integer> c){
		long total = 0;
		int index =  0;
		int len = c.size();
		int busyPainters = 1;
		while(busyPainters<= painters && index<len ){
			total += (long)(c.get(index))*timePerBoard;
			if(total>time){
				total = 0;
				busyPainters++;
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
