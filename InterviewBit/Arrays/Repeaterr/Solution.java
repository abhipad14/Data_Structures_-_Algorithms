package Arrays.Arrays_Repeaterr;

import java.util.ArrayList;

public class Solution {
	public int repeatedNumber(ArrayList<Integer> a) {
	    int size = a.size();
	    int[] count = new int[size-1];
	    int answer = 0;
	    for(int i=0; i<size; i++){
	        if(count[a.get(i)-1]==0){
	            count[a.get(i)-1]++;
	        }
	        else{
	            answer = a.get(i);
	            break;
	        }
	        
	    }
	    return answer;
	}
}
