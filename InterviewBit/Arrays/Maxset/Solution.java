package Arrays.Arrays_Maxset;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		ArrayList<Integer> answer = new ArrayList<>();
		int size = a.size();
		
		long sum = 0, max =0, len = 0, maxlen =0;
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i=0; i<size; i++){
			if(a.get(i)>=0){
				sum+=a.get(i);
				len++;
				temp.add(a.get(i));
			}
			else{
				if(sum>max){
					max  = sum;
					answer = temp;
				}
				else if(sum==max){
					if(len>maxlen){
						maxlen = len;
						answer = temp;
					}
				}
				temp = new ArrayList<>();
				sum = 0;
				len = 0;
			}
		}
		if(sum>max){
			max  = sum;
			answer = temp;
		}
		else if(sum==max){
			if(len>maxlen){
				maxlen = len;
				answer = temp;
			}
		}
		return answer;
	}
	
	
}
