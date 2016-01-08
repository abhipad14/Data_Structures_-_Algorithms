package Strings.CountSay;

public class Solution {
	public String countAndSay(int a) {
		StringBuffer answer  = new StringBuffer();
		StringBuffer previous = new StringBuffer();
		previous.append('1');
		for(int i=0; i<a-1; i++){
			int len = previous.length();
			int count=0;
			char temp = previous.charAt(0);
			count++;
			for(int j=1; j<len; j++){
				if(previous.charAt(j)==temp){
					count++;
				}
				else{
					answer.append(Integer.toString(count));
					answer.append(temp);
					temp = previous.charAt(j);
					count=1;
				}
			}
			answer.append(Integer.toString(count));
			answer.append(temp);
			previous = answer;
			answer = new StringBuffer();
		}
		
		return previous.toString();
	}
}
