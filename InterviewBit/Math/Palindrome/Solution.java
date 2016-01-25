package Math.Math_Palindrome;

public class Solution {
	public boolean isPalindrome(int a) {
		boolean answer = false;
		int b = a, c= a;
		if(a==0){
			return true;
		}
		int count = 0;
		while(a>0){
			a=a/10;
			count++;
		}
		int number = 0;
		while(c>0){
			number += (Math.pow(10, --count))*(c%10);
			c/=10;
		}
		if(number==b){
			answer = true;
		}
		return answer;
	}

}
