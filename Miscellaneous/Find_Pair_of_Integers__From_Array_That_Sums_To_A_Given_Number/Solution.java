package Find_Pair_of_Integers__From_Array_That_Sums_To_A_Given_Number;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = scanf.nextInt();
		}
		
		int find = scanf.nextInt();
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		boolean flag = true;
		for(int i=0; i<n; i++){
			int diff  = find-a[i];
			if(map.containsKey(a[i]) || map.containsKey(diff)){
				if(map.containsKey(diff)){
					if(!map.get(diff)){
						map.put(diff, true);
						System.out.println(a[i]+","+diff);
						flag = false;
					}
				}
			}
			else{
				map.put(a[i], false);
			}
		}
		if(flag){
			System.out.println("No such pairs found");
		}
		
	}

}
