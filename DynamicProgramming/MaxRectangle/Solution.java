package DynamicProgramming.MaxRectangle;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	
	public int maximalRectangle(ArrayList<ArrayList<Integer>> a) {
		int answer = 0;
		int m = a.size();
		if(m==0) return 0;
		int n = a.get(0).size();
		int[] count = new int[n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(a.get(i).get(j)==0){
					count[j] = 0;
				}
				else{
					count[j] = count[j]+1;
				}
			}
			answer = Math.max(answer, largestRectangleArea(count));
		}
		return answer;
	}
	
	
	
	public int largestRectangleArea(int[] a){
        int answer = 0;
		Stack<Integer> s = new Stack<>();
		int i=0;
		int maxarea = -1;
		int area = 0;
		int m = a.length;
		if(m==0) return 0;
		while(i<m){
			if(s.isEmpty() ||  a[i]>=a[s.peek()]){
				s.push(i++);
			}
			else if(a[i]<a[s.peek()]){
				int index = s.pop();
				if(s.isEmpty()){
					area = a[index]*i;
				}
				else{
					area = a[index]*(i-s.peek()-1);
				}
				if(area > maxarea){
					maxarea = area;
				}
			}
		}

		while(!s.isEmpty()){
			int index = s.pop();
			if(s.isEmpty()){
				area = a[index]*i;
			}
			else{
				area = a[index]*(i-s.peek()-1);
			}
			if(area > maxarea){
				maxarea = area;
			}
		}
		answer = maxarea;
		return answer;
    }
}
