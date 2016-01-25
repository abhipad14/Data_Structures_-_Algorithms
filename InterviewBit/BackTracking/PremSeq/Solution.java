package BackTracking.PremSeq;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	static ArrayList<Integer> fact;
	ArrayList<Integer> set;
	public String getPermutation(int n, int k) {
		StringBuilder answer = new StringBuilder();
		fact = new ArrayList<>();
		set = new ArrayList<>();
		
		for(int i=1; i<=n; i++){
			set.add(i);
		}
		factorial(n);
		permi(k-1, n, answer);
		return answer.toString();
	}
	public void permi(int k, int n, StringBuilder answer){
		if(set.size()>0){
			int facto = fact.get(n-1);
			int index = k/facto;
			k = k%fact.get(n-1);
			answer.append(Integer.toString(set.remove(index)));
			permi(k%facto, set.size(), answer);
		}
		
	}
	
	
	public void factorial(int n){
		for(int i=0; i<=n; i++){
			if(i==0){
				fact.add(1);
			}
			else{
				fact.add(fact.get(i-1)*i);
			}
		}
	}
}
