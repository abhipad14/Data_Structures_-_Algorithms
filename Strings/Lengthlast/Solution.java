package Strings.Lengthlast;

public class Solution {
	public int lengthOfLastWord(final String a) {
		int length = 0;
		int answer = 0;
		int len = a.length();
		for(int i=0; i<len; i++){
			if(a.charAt(i)==' '){
				length=0;
			}
			else{
				length++;
				answer = length;
			}
		}
		return answer;
	}
}
