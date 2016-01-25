package Hashing.Colorful;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
	public int colorful(int a) {
		int answer = 1;
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> digits = new ArrayList<>();
		while(a!=0){
			digits.add(a%10);
			if(set.contains(a%10)){
				return 0;
			}
			else{
				set.add(a%10);
			}
			a = a/10;
		}
		Collections.reverse(digits);
		int dig = 2;
		int size  = digits.size();
		while(dig<=size){
			for(int i=0; i<=size-dig; i++){
				int count =0;
				int pro = 1;
				while(count<dig){
					pro *= digits.get(i+count);
					count++;
				}
				if(set.contains(pro)){
					return 0;
				}
				else{
					set.add(pro);
				}
			}
			dig++;
		}
		
		return answer;
	}
}
