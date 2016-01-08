package StacksNQueues.MinStack;

import java.util.Stack;

public class Solution {
	Stack<Integer> main = new Stack<>();
	Stack<Integer> min = new Stack<>();
	public void push(int x) {
	     main.push(x);
	     if(min.isEmpty()){
	    	 min.push(x);
	     }
	     else if(x<=min.peek()){
	    	 min.push(x);
	     }
	}

	public void pop() {
	    if(!main.isEmpty()){
	       int temp =  main.pop();
	        if(min.peek()==temp){
	    	    min.pop();
	        } 
	    }
	}

	public int top() {
		if(main.isEmpty()){
			return -1;
		}
	     return main.peek();   
	}

	public int getMin() {
		if(min.isEmpty()){
			return -1;
		}
		return min.peek();
	}
}
