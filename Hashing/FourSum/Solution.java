package Hashing.FourSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {

	public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> a, int b) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		HashSet<ArrayList<Integer>> set = new HashSet<>();
		Collections.sort(a);
		int len = a.size();
		for(int i=0; i<len-3; i++){
			for(int j=i+1; j<len-2; j++){
				int diff = b-a.get(i)-a.get(j);
				int k = j+1;
				int l = len-1;
				while(k<l){
					int sum =a.get(k)+a.get(l);
					if(sum<diff){
						k++;
					}
					else if(sum>diff){
						l--;
					}
					else{
						ArrayList<Integer> temp = new ArrayList<>();
						temp.add(a.get(i));
						temp.add(a.get(j));
						temp.add(a.get(k));
						temp.add(a.get(l));
						if(!set.contains(temp)){
							set.add(temp);
							answer.add(temp);
						}
						k++;
						l--;
					}
					
				}
			}
		}
		return answer; 
	}
	
	
	
}
