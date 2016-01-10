package Maximum_Area_In_Histogram;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int m = scanf.nextInt();
		int[] a = new int[m];
		
		for(int i=0; i<m; i++){
			a[i]=scanf.nextInt();
		}
		Stack<Integer> s = new Stack<>();
		int i=0;
		int maxarea = -1;
		int area = 0;
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
		System.out.println("Maximum Area="+maxarea);
	}

}
