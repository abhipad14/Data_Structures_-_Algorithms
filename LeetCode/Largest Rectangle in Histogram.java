/*

Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.


Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].


The largest rectangle is shown in the shaded area, which has area = 10 unit.

For example,
Given heights = [2,1,5,6,2,3],
return 10.

*/

public class Solution {
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
