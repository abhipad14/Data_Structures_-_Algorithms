package Math.Math_Excel2;

public class Solution {
	public String convertToTitle(int a) {
		StringBuffer answer = new StringBuffer();
		
		int quo = a;
		int rem = 0;
		while(quo>0){
			rem = quo%26;
			quo = quo/26;
			if(rem==0){
				quo--;
			}
			if(rem==0){
			    answer.append('Z');
			}
			else{
			    char temp = (char) ('A' + --rem);
			    answer.append(temp);
			}
			
		}
		answer.reverse();
		return answer.toString();
	}
}
