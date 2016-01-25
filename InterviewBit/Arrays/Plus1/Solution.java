package Arrays.Arrays_Plus1;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		ArrayList<Integer> answer = new ArrayList<>();
		int size = a.size();
		int carry =0;
		
		for(int i=size-1; i>=0; i--){
			int temp = a.get(i);
			if(i==size-1){
				temp++;
			}
			int sum = carry+ temp;
			if(sum>=10){
				int value = sum%10;
				answer.add(value);
				carry = sum/10;
			}
			else{
				answer.add(sum);
				carry = 0;
			}
		}
		
		if(carry>0){
			answer.add(carry);
		}
		Collections.reverse(answer);
		
		int len = answer.size();
		int count = 0;
		for(int i=0; i<len; i++){
			
			if(answer.get(count)==0){
				
				answer.remove(i);
			}
			else{
				break;
			}
			
		}
		
		return answer;
	}
}
