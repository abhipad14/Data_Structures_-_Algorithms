/*
Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones and return its area.
*/


public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int answer = Integer.MIN_VALUE;
        int m = matrix.length;
        if(m==0) return 0;
        int n = matrix[0].length;
        int[] count = new int[n];
        for(int i=0; i<m; i++){
        	for(int j=0; j<n; j++){
        		if(matrix[i][j]=='0'){
        			count[j]=0;
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

