package Modified_Fibonacci;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		long A = scanf.nextLong();
		long B = scanf.nextLong();
		int N = scanf.nextInt();
		
		for(int i=3; i<=N; i++){
			
				long C = (int) (Math.pow(B, 2)+A);
				if(i==N){
					System.out.println(C);
				}
				A=B;
				B=C;
		}
		

	}

}
