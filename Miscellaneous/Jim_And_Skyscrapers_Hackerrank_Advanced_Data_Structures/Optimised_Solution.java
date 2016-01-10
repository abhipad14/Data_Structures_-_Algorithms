package Jim_And_Skyscrapers_Hackerrank_Advanced_Data_Structures;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;

public class Optimised_Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		Stack<Integer> s = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int a;
		long ways=0;
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = scanf.nextInt();
		}
		for(int i=0; i<n; i++){
			a = arr[i];
			if(s.isEmpty()){
				s.push(a);
				if(map.containsKey(a)){
					map.put(a, map.get(a)+1);
				}
				else{
					map.put(a, 1);
				}
			}
			else{
				if(a<s.peek()){
					if(map.containsKey(a)){
						ways += map.get(a);
						
						map.put(a, map.get(a)+1);
					}
					else{
						s.push(a);
						map.put(a, 1);
					}					
				}
				else{
					while(true){
						if(s.peek()<a){
							int b = s.pop();
							map.remove(b);
							if(s.isEmpty()  || s.peek()>=a){
								break;
							}
						}
						else{
							break;
						}
					}
					if(s.isEmpty()){
						s.push(a);
						map.put(a, 1);
					}
					else if(s.peek()== a){
						ways += map.get(a);
						
						map.put(a, map.get(a)+1);
					}
					else if(s.peek() > a){
						s.push(a);
						map.put(a, 1);
					}
				}
			}
		}
		System.out.println(2*ways);
	}

}
