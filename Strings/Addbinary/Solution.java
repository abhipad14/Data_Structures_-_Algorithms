package Strings.Addbinary;

public class Solution {
	public String addBinary(String a, String b) {
		StringBuilder answer = new StringBuilder();
		int len1 = a.length();
		int len2 = b.length();
		if(len1!=len2){
			int diff = len1-len2;
			if(diff>0){
				for(int i=0; i<diff; i++){
					b = '0'+b;
				}
			}
			else{
				diff = 0-diff;
				for(int i=0; i<diff; i++){
					a = '0'+a;
				}
			}
		}
		char carry = '0';
		int i=a.length()-1;
		while(i>=0){
			char one = a.charAt(i);
			char two = b.charAt(i);
			if(carry=='0'){
				if(one=='1' && two=='1'){
					answer.append('0');
					carry='1';
				}
				else if(one=='1' || two=='1'){
					answer.append('1');
				}
				else{
					answer.append('0');
				}
			}
			else{
				if(one=='1' && two=='1'){
					answer.append('1');
					carry='1';
				}
				else if(one=='1' || two=='1'){
					answer.append('0');
					carry = '1';
				}
				else{
					answer.append('1');
					carry = '0';
				}
			}
			i--;
		}
		if(carry=='1'){
			answer.append(carry);
		}
		answer.reverse();
		return answer.toString();
	}
}
