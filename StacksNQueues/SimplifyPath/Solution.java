package StacksNQueues.SimplifyPath;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public String simplifyPath(String a) {
		StringBuilder answer = new StringBuilder();
		
		Stack<String> dir = new Stack<>(); 
		int len = a.length();
		StringBuilder dummy = new StringBuilder();
		int count =0;
		for(int i=0; i<len; i++){
			for(int j=0; j<count-1; j++){
				if(!dir.isEmpty())
					dir.pop();
			}
			if(a.charAt(i)=='/'){
				if(dummy.length()!=0){
					dir.add(dummy.toString());
				}
				dummy = new StringBuilder();
				count =0;
			}
			else{
				if(a.charAt(i)!='.'){
					dummy.append(a.charAt(i));
					count =0;
				}
				else if(a.charAt(i)=='.'){
					count++;
				}
			}
		}
		if(count>0){
			for(int j=0; j<count-1; j++){
				if(!dir.isEmpty())
					dir.pop();
			}
		}
		if(dummy.length()!=0){
			dir.add(dummy.toString());
		}
		if(dir.isEmpty()){
			answer.append('/');
		}
		Stack<String> dir2 = new Stack<>();
		while(!dir.isEmpty()){
			dir2.push(dir.pop());
		}
		while(!dir2.isEmpty()){
			answer.append('/');
			answer.append(dir2.pop());
		}
		return answer.toString();
	}
}
