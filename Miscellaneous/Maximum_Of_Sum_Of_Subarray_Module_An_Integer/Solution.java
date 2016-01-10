package Maximum_Of_Sum_Of_Subarray_Module_An_Integer;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int T = scanf.nextInt();
		long[] answer = new long[T];
		for(int i=0; i<T; i++){
			int n = scanf.nextInt();
			long m = scanf.nextLong();
			long[] numbers = new long[n];
			
			for(int j=0; j<n; j++){
				numbers[j]=scanf.nextLong();
			}
			
			answer[i]=getMax(numbers, m);
			
		}
		for(int i=0; i<T; i++){
			System.out.println(answer[i]);
		}
	}

	
	public static long getMax(long[] numbers, long m){
		long max=-1;
		for(int j=0; j<numbers.length; j++){
			long sum=0;
			for(int k=j; k<numbers.length; k++){
				sum += numbers[k];
				if(sum%m > max){
					max= sum%m;
				}
			}
		}
		return max;
	}
		
}
