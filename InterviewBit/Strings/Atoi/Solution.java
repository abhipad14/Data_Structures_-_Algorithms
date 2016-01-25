package Strings.Atoi;

public class Solution {
	public int atoi(String a) {
		long answer = 0;
		StringBuffer num = new StringBuffer();
		int len = a.length();
		int count = 0;
		boolean flag = false;
		boolean neg = false;
		boolean pos = false;
		for(int i=0; i<len; i++){
			if(a.charAt(i)!=' ' && a.charAt(i)!='-' && a.charAt(i)!='+'){
				flag = true;
			}
			else if(a.charAt(i)=='-' ){
				neg = true;
			}
			else if(a.charAt(i)=='+' ){
				pos = true;
			}
			else if((neg || pos) && i>0){
				break;
			}
			if(flag){
				if(a.charAt(i)>='0' && a.charAt(i)<='9'){
					num.append(a.charAt(i));
				}
				else{
					break;
				}
			}
		}
		int numlen = num.length();
		if(numlen>10){
			if(neg){
				return Integer.MIN_VALUE;
			}
			else{
				return Integer.MAX_VALUE;
			}
		}
		for(int i=0; i<num.length(); i++){
			int temp = (int)(0+num.charAt(i)-'0');
			answer = answer + temp*(long)Math.pow(10, --numlen);
		}
		if(answer>Integer.MAX_VALUE){
			if(neg){
				return Integer.MIN_VALUE;
			}
			else{
				return Integer.MAX_VALUE;
			}
		}
		else{
			if(neg){
				answer = 0-answer;
			}
		}

		return (int)answer;
	}
}
