/*
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
*/


public class Solution {
    public int longestValidParentheses(String s) {
        int answer = 0;
        int len = s.length();
        int size = 0;
        if(len<=1) return 0;
        Stack<Integer> brackets = new Stack<>();
        brackets.push(-1);
        for(int i=0; i<len; i++){
        	char temp = s.charAt(i);
        	if(temp=='('){
        		brackets.push(i);
        	}
        	else{
        		brackets.pop();
        		if(!brackets.isEmpty()){
        			answer = Math.max(answer, i-brackets.peek());
        		}
        		else{
        			brackets.push(i);
        		}
        	}
        }
        return answer;
    }
}