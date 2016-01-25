package StacksNQueues.RevString;


import java.util.Stack;

public class Solution {
	public String reverseString(String a) {
		StringBuilder answer = new StringBuilder();
		int len = a.length();
		Stack<Character> rev = new Stack<>();
		for(int i=0; i<len; i++){
			rev.push(a.charAt(i));
		}
		while(!rev.isEmpty()){
			answer.append(rev.pop());
		}
		return answer.toString();
	}
}
