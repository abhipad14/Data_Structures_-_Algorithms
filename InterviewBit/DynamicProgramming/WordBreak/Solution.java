package DynamicProgramming.WordBreak;

import java.util.ArrayList;
import java.util.Set;

public class Solution {

	public int wordBreak(String a, ArrayList<String> b) {
		int[] valid = new int[a.length()+1];
		valid[0] = 1;
		int length =a.length();
		for(int i=0; i<length; i++){
        	if(valid[i]==1){
        		for(String word: b){
        			int len = word.length();
        			int end = i + len;
        			if(end > a.length())
        				continue;
    
        			if(valid[end]==1) continue;
    
        			if(a.substring(i, end).equals(word)){
        				valid[end] = 1;
        			}
        		}
        	}
        }
		return valid[length];
	}
}
