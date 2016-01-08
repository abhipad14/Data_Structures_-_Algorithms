package Strings.Palindrome;

public class Solution {
	public int isPalindrome(String a) {
		int answer = 1;
		int len = a.length();
		StringBuffer b = new StringBuffer();
		for(int i=0; i<len; i++){
			if(a.charAt(i)>='a'  &&  a.charAt(i)<='z'){
				char temp = (char) ((char)a.charAt(i)-'a'+'A');
				b.append(temp);
			}
			else if((a.charAt(i)>='A'  &&  a.charAt(i)<='Z')|| (a.charAt(i)>='0'  &&  a.charAt(i)<='9')){
				b.append(a.charAt(i));
			}
		}
		
		len = b.length();
		int left = 0;
		int right = len-1;
		while(left<right){
			char one = b.charAt(left);
			char two = b.charAt(right);
			if(('A'<=one && one<='Z')  && ('A'<=two && two<='Z')){
				if(one!=two){
					answer = 0;
					break;
				}
				left++;
				right--;
				
			}
			else if(('0'<=one && one<='9')  && ('0'<=two && two<='9')){
				if(one!=two){
					answer = 0;
					break;
				}
				left++;
				right--;
			}
			else {
				answer = 0;
				break;
			}
			
		}
		return answer;
	}
}
