package Math.Math_Excel1;

public class Solution {
	public int titleToNumber(String a) {
		int answer = 0;
		
		int size = a.length();
		int power;
		for(int i=size-1; i>=0; i--){
			char temp = a.charAt(i);
			int value = temp-'A';
			power = size-1-i;
			answer += ++value*Math.pow(26, power);
		}
		return answer;
	}
}
