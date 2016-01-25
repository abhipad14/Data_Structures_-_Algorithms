package StacksNQueues.EvalExp;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public int evalRPN(ArrayList<String> a) {
		int answer = 0;
		int len = a.size();
		Stack<String> num = new Stack<>();
		
		for(int i=0; i<len; i++){
			if(a.get(i).equals("+") || a.get(i).equals("-") || a.get(i).equals("*") || a.get(i).equals("/")){
				String one =  num.pop();
				String two = num.pop();
				int num2 = Integer.parseInt(one);
				int num1 = Integer.parseInt(two);
				int val = 0;
				if(a.get(i).equals("+")){
					val = num1+num2;
				}
				else if(a.get(i).equals("-")){
					val = num1-num2;
				}
				else if(a.get(i).equals("*")){
					val = num1*num2;
				}
				else if(a.get(i).equals("/")){
					val = num1/num2;
				}
				num.push(Integer.toString(val));
			}
			else{
				num.push(a.get(i));
			}
		}
		answer = Integer.parseInt(num.pop());
		return answer;
	}
}
