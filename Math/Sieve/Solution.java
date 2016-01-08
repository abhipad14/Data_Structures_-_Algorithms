package Math.Math_Sieve;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> sieve(int a) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] arr = new int[a+1];
		for(int i=0; i<=a; i++){
			if(i<2){
				arr[i]=0;
			}
			else{
				arr[i]=1;
			}
		}
		int n = (int)Math.sqrt(a);
		for(int i=2; i<=n; i++){
			int count = 2;
			for(int j=2*i; j<=a; j=++count*i){
				arr[j]=0;
			}
		}
		for(int i=2; i<=a; i++){
			if(arr[i]==1){
				answer.add(i);
			}
		}
		return answer;
	}

}
