package StacksNQueues.Nearest;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int len = arr.size();
		Stack<Integer> list = new Stack<>();
		for(int i=0; i<len; i++){
			if(list.isEmpty()){
				answer.add(-1);
				list.push(arr.get(i));
			}
			else{
				while(!list.empty()  &&  list.peek()>=arr.get(i)){
					list.pop();
				}
				if(list.empty()){
					answer.add(-1);
				}
				else{
					answer.add(list.peek());
				}
				list.push(arr.get(i));
				
			}
		}
		return answer;
    }
}
