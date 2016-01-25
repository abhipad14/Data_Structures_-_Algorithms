package Strings.Revword;

public class Solution {
	public String reverseWords(String a) {
		 StringBuffer rev = new StringBuffer(a);
			StringBuffer answer = new StringBuffer();
			rev.reverse();
			int len = rev.length();
			StringBuffer temp = new StringBuffer();
			for(int i=0; i<len; i++){
				if(rev.charAt(i)!=' '){
					temp.append(rev.charAt(i));
				}
				else{
					if(temp.length()>0){
						temp.reverse();
						answer.append(temp.toString());
						if(i!=len-1 && rev.charAt(i-1)!=' '){
							answer.append(' ');
						}
						temp = new StringBuffer();
					}
					
				}
			}
			temp.reverse();
			answer.append(temp);
			if(answer.charAt(answer.length()-1)==' '){
				return answer.subSequence(0, answer.length()-1).toString();
			}
			else{
				return answer.toString();
			}
		
	}
}
