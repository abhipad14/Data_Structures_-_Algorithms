package Lexicographically_Minimum_String;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int T = scanf.nextInt();
		String[] ans = new String[T];
		for(int i=0; i<T; i++){
			String s1 = scanf.next();
			String s2 = scanf.next();
			
			ans[i] = getString(s1,s2).toString();
			
		}
		for(int i=0; i<T; i++){
			System.out.println(ans[i]);
		}
	}

	
	
	public static StringBuffer getString(String s1, String s2){
		String a = "a";
		StringBuffer answer = new StringBuffer();
		int count1 = 0;
		int count2 = 0;
		while(count1 < s1.length()  &&  count2 < s2.length()){
			if(s1.charAt(count1) <= s2.charAt(count2)){
				answer.append(s1.charAt(count1));
				count1++;
			}
			else{
				answer.append(s2.charAt(count2));
				count2++;
			}
		}
		if(count1 == s1.length()){
			answer.append(s2.substring(count2));
		}
		else{
			answer.append(s1.substring(count1));
		}
		return answer;
	}
}
