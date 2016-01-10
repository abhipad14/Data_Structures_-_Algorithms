package Sort_A_Stack_Using_Only_One_Additional_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		for(int i=0; i<n; i++){
			s1.push(scanf.nextInt());
		}
		
		Sort(s1, s2);
		
		while(!s2.isEmpty()){
			System.out.print(s2.pop()+"->");
		}

	}

	
	
	public static void Sort(Stack<Integer> s1, Stack<Integer> s2){
		while(!s1.isEmpty()){
			if(s2.isEmpty()){
				s2.push(s1.pop());
			}
			else{
				int temp = s1.pop();
				while(!s2.isEmpty() &&   s2.peek()>temp  ){
					s1.push(s2.pop());
				}
				s2.push(temp);
			}
		}
	}
}

