package N_Steps_3_Hops_Find_Different_Ways_Of_Reaching_Last_Step;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int[] count = new int[n];
		for(int i=0; i<n; i++){
			count[i]=-1;
		}
		int answer = Find(n-1, count);
		System.out.println(answer);
	}

	
	
	public static int Find(int n, int[] m){
		if(n<0){
			return 0;
		}
		else if(n==0){
			return 1;
		}
		else if(m[n]>-1){
			return m[n];
		}
		else{
			m[n]=  Find(n-1, m)+  Find(n-2, m)+ Find(n-3, m);
			return m[n];
		}
	}
}
