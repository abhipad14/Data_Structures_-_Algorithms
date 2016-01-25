package Math.Math_Decibin;

import java.util.ArrayList;

public class Solution {
	public String findDigitsInBinary(int a) {
		StringBuffer answer = new StringBuffer();
		ArrayList<Integer> temp = new ArrayList<>();
		if(a==0){
			return "0";
		}
		while(a>0){
			temp.add(a%2);
			a=a/2;
		}
		int size = temp.size();
		for(int i=size-1; i>=0; i--){
			answer.append(temp.get(i).toString());
		}
		return answer.toString();
	}

}
