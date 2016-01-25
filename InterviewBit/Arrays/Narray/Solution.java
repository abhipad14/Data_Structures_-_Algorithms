package Arrays.Arrays_Narray;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public ArrayList<Integer> repeatedNumber(ArrayList<Integer> a) {
		ArrayList<Integer> answer = new ArrayList<>();
		long size = (long)a.size();
		long sumr = size*(size+1)/2;
		long sqrr = size*(size+1)*(2*size+1)/6;
		long suma=0, sqra=0;
		for(int i=0; i<size; i++){
			suma += (long)a.get(i).intValue();
			sqra += (long)Math.pow(a.get(i).intValue(), 2);
		}
		long x = (long)((sqra-sqrr)/(suma-sumr));
		long y = (long)(suma-sumr);
		int rep = (int) (0.5*(x+y));
		int miss = (int) (rep - y);
		answer.add(rep);
		answer.add(miss);
		return answer;
	}
	
	
	
	
}
