package TwoPointer.Threesumzeros;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		
		Collections.sort(a);
		int len = a.size();
		int i=0; 
		while(i<len-2){
			if(i!=0){
				while(i<len-2){
					int one = a.get(i);
					int two = a.get(i-1);

					if(one!=two){
						break;
					}
					else{
						i++;
					}
				}
				
			}
			int sum = a.get(i);
			int start = i+1;
			int end = len-1;
			while(start<end){
				int temp = sum +a.get(start)+a.get(end);
				if(temp==0){
					ArrayList<Integer> dummy = new ArrayList<>();
					dummy.add(a.get(i));
					dummy.add(a.get(start));
					dummy.add(a.get(end));
					answer.add(dummy);
					while(start<end){
						if(a.get(end-1)!=a.get(end)){
							end--;
							break;
						}
						else{
							end--;
						}
					}
				}
				else if(temp<0){
					start++;
				}
				else{
					end--;
				}
			}
			i++;
		}
		return answer;
	}
}
