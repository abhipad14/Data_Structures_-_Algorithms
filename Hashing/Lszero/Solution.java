package Hashing.Lszero;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public ArrayList<Integer> lszero(ArrayList<Integer> a) {
		ArrayList<Integer> answer = new ArrayList<>();
		int start =0;
		int end = 0;
		int maxlen = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int size = a.size();
		for(int i=0; i<size; i++){
			if(a.get(i)==0){
				answer.add(a.get(i));
				maxlen = 1;
				start = i;
				end = i;
				break;
			}
		}
		int sum = 0, len;
		for(int i=0; i<size; i++){
			sum += a.get(i);
			if(sum==0){
				
				len = i+1;
				if(len>maxlen){
					start =0;
					end  = i;
					maxlen = len;
				}
			}
			else{
				if(!map.isEmpty() &&  map.containsKey(sum)){
					len = i-(map.get(sum));
					if(len>maxlen){
						start = map.get(sum)+1;
						end  = i;
						maxlen = len;
					}
				}
				else{
					map.put(sum, i);
				}
			}
			
		}
		if(end-start>0){
			answer = new ArrayList<>();
			for(int i=start; i<=end; i++){
				answer.add(a.get(i));
			}
		}
		
		return answer;
    }
}
