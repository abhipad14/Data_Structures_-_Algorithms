package Math.Math_Factors;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public ArrayList<Integer> allFactors(int a) {
	    ArrayList<Integer> answer = new ArrayList<>();
	    
	    double n = Math.sqrt(a);
	    for(int i=1; i<=n; i++){
	        if(a%i==0){
	           answer.add(i);
	           if(i!=n){
	               answer.add((int)(a/i));
	           }
	        }
	    }
	    Collections.sort(answer);
	    return answer;
	}

}
