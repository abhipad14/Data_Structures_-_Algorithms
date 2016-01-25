package Arrays.Arrays_MaxSum;

import java.util.ArrayList;

public class Solution {
	
	public int maxSubArray(ArrayList<Integer> a) {
	    int sum= 0;
	    int max=0;
	    int size = a.size();
	    int count=0;
	    for(int i=0; i<size; i++ ){
	    	if(i==0)
	    		max = a.get(i);
	    	else{
	    		if(a.get(i)>0){
	    			count++;
	    		}
	    		if(a.get(i)>max){
	    			max = a.get(i);
	    		}
	    	}
	    	if(count>1){
	    		break;
	    	}
	    }
	    if(count>1){
	    	max = 0;
	    	for(int i=0; i<size; i++){
	    		max += a.get(i);
	    		if(max>sum){
	    			sum=max;
	    		}
	    		if(max<0){
	    			max = 0;
	    		}
	    	}
	    }
	    else{
	    	sum = max;
	    }
	    return sum;
	}
}
