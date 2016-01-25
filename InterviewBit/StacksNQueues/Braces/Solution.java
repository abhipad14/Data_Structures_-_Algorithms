package StacksNQueues.Braces;

import java.util.Stack;

public class Solution {
	public int braces(String a) {
		int answer = 0;
		Stack<Character> list = new Stack<>();
		int len = a.length();
		boolean exp=false, brac = false;
		for(int i=0; i<len; i++){
			exp = false;
			brac = false;
			char temp = a.charAt(i);
			if(temp=='(' ||  temp=='+'  || temp=='-'  ||  temp=='*' || temp=='/'){
				list.push(temp);
			}
			else if(temp==')'){
				while(true){
					if(list.isEmpty()){
						answer = 1;
						brac = true;
						break;
					}
					else{
						if(list.peek()=='+' ||  list.peek()=='-' || list.peek()=='*'  || list.peek()=='/'){
							exp = true;
							list.pop();
						}
						else if(list.peek()=='('){
							if(exp){
								list.pop();
								break;
							}
							else{
								answer =  1;
								brac = true;
								break;
							}
						}
					}
					
				}
				if(brac){
					break;
				}
			}
		}
		
		return answer;
	}
}
