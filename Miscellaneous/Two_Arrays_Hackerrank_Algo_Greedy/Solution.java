package Two_Arrays_Hackerrank_Algo_Greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int t = scanf.nextInt();
		String[] ans = new String[t];
		for(int i=0; i<t; i++){
			int n = scanf.nextInt();
			int k = scanf.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int j=0; j<n; j++ ){
				a[j] = scanf.nextInt();
			}
			for(int j=0; j<n; j++){
				b[j] = scanf.nextInt();
			}
			Arrays.sort(b);
			int count = 0;
			String answer = "DEMO";
			HashMap<Integer, Boolean> map = new HashMap<>();
			
			for(int j=0; j<n; j++){
				int diff = k-a[j];
				for(int x=0; x<n; x++){
					if(!map.containsKey(x)){
						if(b[x]>=diff){
							map.put(x, true);
							count++;
							break;
						}
					}
				}
			}
			if(count==n){
				answer="YES";
			}
			else{
				answer="NO";
			}
			ans[i]=answer;
			
		}
		for(int i=0; i<t; i++){
			System.out.println(ans[i]);
		}
	}
	
	
	

}
