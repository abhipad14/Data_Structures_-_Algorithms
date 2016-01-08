package StacksNQueues.MinStack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution(); 
		int n = scanf.nextInt();
		int i=0;
		ArrayList<String> a = new ArrayList<>();
		for(i=0; i<n; i++){
			String temp = scanf.next();
			if(temp.equals("P")){
				String temp2 = scanf.next();
				a.add(temp);
				a.add(temp2);
			}
			else{
				a.add(temp);
			}
		}
		i=0;
		System.out.println();
		while(i<a.size()-1){
			
			if(a.get(i).equals("g")){
				System.out.print(ans.getMin()+" ");
			}
			if(a.get(i).equals("t")){
				System.out.print(ans.top()+" ");
			}
			if(a.get(i).equals("p")){
				ans.pop();
			}
			if(a.get(i).equals("P")){
				i++;
				int num = Integer.parseInt(a.get(i));
				ans.push(num);
			}
			i++;
		}
	}

}
