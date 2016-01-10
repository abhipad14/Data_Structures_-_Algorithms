package Posinious_Tree_Optimised;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		Stack<Node> s1 = new Stack<>();
		int[] a = new int[n];
		int max = 0;
		for(int i=0; i<n; i++){
			a[i] = scanf.nextInt();
			if(s1.isEmpty()){
				Node dummy = new Node();
				dummy.data = a[i];
				dummy.day = 0;
				s1.push(dummy);
			}
			else{
				if(a[i]>s1.peek().data){
					Node dummy = new Node();
					dummy.data = a[i];
					dummy.day = 1;
					s1.push(dummy);
					if(dummy.day>max){
						max = dummy.day;
					}
				}
				else{
					boolean flag = true;
					int day, maxday=0;
					while(flag){
						day = s1.pop().day;
						if(day>maxday){
							maxday = day;
						}
						if(s1.isEmpty()){
							Node dummy = new Node();
							dummy.data = a[i];
							dummy.day = 0;
							s1.push(dummy);
							flag = false;
						}
						else if(s1.peek().data < a[i]){
							Node dummy = new Node();
							dummy.data = a[i];
							dummy.day = maxday+1;
							s1.push(dummy);
							flag = false;
							if(dummy.day>max){
								max = dummy.day;
							}
						}
						
					}
				}
			}
		}
			
		System.out.println(max);
		
	}

}
