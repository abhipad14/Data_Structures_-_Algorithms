package StacksNQueues.Parenthisis;

import java.util.Stack;

public class Solution {
	public int isValid(String a) {
		int answer = 1;
		Stack<Character> brackets = new Stack<>();
		int len = a.length();
		for(int i=0; i<len; i++){
			if(a.charAt(i)=='{'  || a.charAt(i)=='[' || a.charAt(i)=='('){
				brackets.push(a.charAt(i));
			}
			else{
				if(brackets.isEmpty()){
					answer = 0;
					break;
				}
				else{
					if(a.charAt(i)==')'){
						if(brackets.peek()=='('){
							brackets.pop();
						}
						else{
							answer = 0;
							break;
						}
					}
					else if(a.charAt(i)=='}'){
						if(brackets.peek()=='{'){
							brackets.pop();
						}
						else{
							answer = 0;
							break;
						}
					}
					else{
						if(brackets.peek()=='['){
							brackets.pop();
						}
						else{
							answer = 0;
							break;
						}
					}
				}
				
			}
		}
		if(!brackets.isEmpty()){
		    answer = 0;
		}
		return answer;
	}
}
