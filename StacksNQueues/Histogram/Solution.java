package StacksNQueues.Histogram;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public int largestRectangleArea(ArrayList<Integer> a) {
		int answer = 0;
		Stack<Integer> s = new Stack<>();
		int i=0;
		int maxarea = -1;
		int area = 0;
		int m = a.size();
		while(i<m){
			if(s.isEmpty() ||  a.get(i)>=a.get(s.peek())){
				s.push(i++);
			}
			else if(a.get(i)<a.get(s.peek())){
				int index = s.pop();
				if(s.isEmpty()){
					area = a.get(index)*i;
				}
				else{
					area = a.get(index)*(i-s.peek()-1);
				}
				if(area > maxarea){
					maxarea = area;
				}
			}
		}

		while(!s.isEmpty()){
			int index = s.pop();
			if(s.isEmpty()){
				area = a.get(index)*i;
			}
			else{
				area = a.get(index)*(i-s.peek()-1);
			}
			if(area > maxarea){
				maxarea = area;
			}
		}
		answer = maxarea;
		return answer;
	}
}
