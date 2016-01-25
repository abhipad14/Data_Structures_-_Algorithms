package Citrix_Test;

import java.util.Scanner;

public class TicketSell {

	public static void main(String[] args) {
		int n, max = 0;
		long m;
		Scanner scanf = new Scanner(System.in);
		n = scanf.nextInt();
		m = scanf.nextInt();
		int[] a = new int[n];
		long[] count = new long[100000];
		for(int i=0; i<n; i++){
			a[i] = scanf.nextInt();
			count[a[i]-1]++;
			if(i == 0)
				max = a[i];
			else if (a[i]>max)
				max = a[i];
		}
		long sum = 0;
		for(int i = max-1; i>=0; i--){
			if(m <= count[i]){
				sum = sum + m*(i+1);
				break;
			}
			else{
				sum = sum + count[i]*(i+1);
				if(i>0){
					count[i-1] += count[i];
				}
				m = m - count[i];
			}	
		}
		System.out.println(sum);
	}

}
