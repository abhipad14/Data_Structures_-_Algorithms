package HeapsAndMaps.Dnums;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		ArrayList<Integer> list = new ArrayList<>();
	    HashMap<Integer, Integer> map = new HashMap<>();
	    int j= 0;
	    for(int i = 0; i < A.size(); i++){
	    	if(i<B){
	    		if(map.containsKey(A.get(i))){
		    		int count = map.get(A.get(i));
		    		map.put(A.get(i), ++count);
		    	}
		    	else{
		    		map.put(A.get(i), 1);
		    	}
	    		if(i==B-1){
	    			list.add(map.size());
	    		}
	    	}
	    	else{
	    		if(map.containsKey(A.get(i))){
		    		int count = map.get(A.get(i));
		    		map.put(A.get(i), ++count);
		    	}
		    	else{
		    		map.put(A.get(i), 1);
		    	}
	    		int sum = map.get(A.get(j));
	    		sum--;
	    		if(sum==0){
	    			map.remove(A.get(j));
	    		}
	    		else{
	    			map.put(A.get(j), sum);
	    		}
	    		j++;
	    		list.add(map.size());
	    	}
	    	
	    }
	    return list;
	}
}
