package Petrol_Pumps_In_Circles;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] petrol = new int[n];
		int[] distance = new int[n];
		for(int i=0; i<n; i++){
			petrol[i] = scanf.nextInt();
			distance[i] = scanf.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++){
			if(petrol[i]>=distance[i]){
				list.add(i);
			}
		}
		int counter=0;
		int gas = 0;
		int i=0;
		int answer = -1;
		while(counter<n){
			counter = 0;
			i = list.get(0);
			list.remove(0);
			gas = 0;
			answer = i;
			while(i<n){
				gas += petrol[i];
				if(gas>=distance[i]){
					gas -= distance[i];
					counter++;
					i++;
				}
				else{
					break;
				}
				if(counter==n){
					break;
				}
				if(i == n){
					i=0;
				}
			}
			
		}
		System.out.println(answer);
	}

}
