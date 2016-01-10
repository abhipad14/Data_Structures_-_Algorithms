package Poisinous_Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] pest = new int[n];
		ArrayList<Integer> stack1 = new ArrayList<>();
		ArrayList<Integer> stack2 = new ArrayList<>();
		for(int i=0; i<n; i++){
			pest[i]=scanf.nextInt();
			stack2.add(pest[i]);
		}
		int size2 = stack2.size();
		boolean flag = false;
		int days = 0;
		while(!flag){
			stack1.clear();
			for(int i:stack2){
				stack1.add(i);
			}
			stack2.clear();
			int counter = 0;
			int current,previous=0;
			int check =0;
			for(int i:stack1){
				if(counter==0){
					previous = i;
					stack2.add(i);
					counter++;
				}
				else{
					current = i;
					if(current<=previous){
						stack2.add(i);
						check++;
					}
					previous = current;
				}
			}
			if(check < stack1.size()-1){
				days++;
			}
			else{
				flag=true;
			}
		}
		System.out.println(days);
	}

}
