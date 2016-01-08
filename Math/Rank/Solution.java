package Math.Math_Rank;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public int findRank(String a) {
		int answer = 0;
		ArrayList<Integer> facts = new ArrayList<>();
		facts = factorial(a.length());
		int len  = a.length();
		for(int i=0; i<len; i++){
			int count = 0;
			for(int j=i+1; j<len; j++){
				if(a.charAt(j)<a.charAt(i)){
					count++;
				}
			}
			answer = (answer+count*facts.get(len-1-i))%1000003;
		}
		return ++answer;
	}
	
	public ArrayList<Integer> factorial(int len){
		ArrayList<Integer> fact = new ArrayList<>();
		fact.add(0);
		int f = 1;
		for(int i=1; i<len; i++){
			f = (f*i)%1000003;
			fact.add(f);
		}
		return fact;
	}
	
}
